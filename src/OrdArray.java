public class OrdArray {

    private long[] arr;  // reference to array
    private int nElements;   // Number of elements

    public OrdArray(int max){
        arr = new long[max];
        nElements = 0;
    }
    public int size(){
        return nElements;
    }
    public int find(long searchkey){
        int lowerBound = 0;
        int upperBound = nElements-1;
        int curIn;

        while (true){
            curIn = (lowerBound+upperBound)/2;
            if (arr[curIn]== searchkey)
                return curIn;
            else if (lowerBound> upperBound)
                return nElements;
            else {
                if (arr[curIn] < searchkey)
                    lowerBound = curIn + 1;
                else
                    upperBound = curIn - 1;
            }

        }
    }
    public void insert(long value){
        int j;
        for (j=0; j<nElements; j++)
            if (arr[j] > value)
                break;
         for (int k =nElements; k>j; k--)
             arr[k] = arr[k-1];
         arr[j] = value;
         nElements++;

    }
    public boolean delete(long value){
        int j = find(value);
        if(j==nElements)
            return false;
        else{
            for (int k=j; k<nElements;k++)
                arr[k] = arr[k+1];
            nElements--;
            return true;
        }
    }
    public void display(){
        for (int j=0;j<nElements;j++)
            System.out.println(arr[j] + "");
        System.out.println("");
    }
}
