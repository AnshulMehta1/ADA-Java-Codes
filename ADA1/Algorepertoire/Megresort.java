

package Algorepertoire;

public class Megresort {
    //Divide and conquer algorithm 
    //create methods for dividing merging and merging 
    void merge (int arr[],int beg, int mid,int end){
        // defining the size of the arrays 
        int size1=mid-beg+1;
        int size2=end-mid;
        //size of two sub arrays that are to be merged
        int leftArr[]= new int[size1];
        int rightArr[] = new int [size2];

        // copy data of two arrays into temp arrs
        for (int i=0;i<size1;i++){
            leftArr[i]=arr[beg+i];
        }
        for (int j=0;j<size2;j++){
            rightArr[j]=arr[mid+1+j];
        }

         // Initial indexes of first and second subarrays
         //These are like pointers pointing to the 1st and second sub aaray 
        int i = 0, j = 0;
          // Initial index of merged subarry array
        int k =1;
        while (i< size1 && j< size2){
            // comparing the first elements of both the subarrays
            //if 1st element of la is smaller than 1st element of ra then it gets placed in k arraY and la gets iterated an element further
            //k is pointer to the left array that goes on to be the final array
            //if not then element of right array gets 1st place in the k array and right ka element is iterated further
            if (leftArr[i]<=rightArr[j]){
                arr[k]= leftArr[i];
                i++;
                
            }
            
            else {
                arr[k]=rightArr[j];
                j++;
               
            }
            
            k++;
        }
        //now what this while does is that size 1 sudhi na elements which are already sorted ene la ma mukse
        while (i<size1){
            arr[k]=leftArr[i];
            i++;
            k++;
            
        }
       
        // and this while will put sorted elements from size1 to size 2 in ra
        while (j<size2){
            arr[k]=rightArr[j];
            j++;
            k++;
           

        }
        
        

        
        }
        // 
    void sort (int arr[], int beg, int end ){
        if (beg<end){
            int mid= (beg+end)/2;
            sort(arr,beg,mid);
            sort(arr,mid+1,end);

            merge(arr,1,mid,end);
            
        }
    }
    static void printArray(int arr[]) 

    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 

    public static void main(String[] args) {
        
        int arr[]={1,45,23,76,33};
        
        Megresort ms= new Megresort();
        ms.sort(arr, 1, arr.length-1);
        printArray(arr);


    }




    }

    











/* Step 1: [INITIALIZE] SET I = BEG, J = MID + 1, INDEX = 0
Step 2: Repeat while (I <= MID) AND (J<=END)
IF ARR[I] < ARR[J]
SET TEMP[INDEX] = ARR[I]
SET I = I + 1
ELSE
SET TEMP[INDEX] = ARR[J]
SET J = J + 1
[END OF IF]
SET INDEX = INDEX + 1
[END OF LOOP]
Step 3: [Copy the remaining
elements of right sub-array, if
any]
IF I > MID
Repeat while J <= END
SET TEMP[INDEX] = ARR[J]
SET INDEX = INDEX + 1, SET J = J + 1
[END OF LOOP]
[Copy the remaining elements of
left sub-array, if any]
ELSE
Repeat while I <= MID
SET TEMP[INDEX] = ARR[I]
SET INDEX = INDEX + 1, SET I = I + 1
[END OF LOOP]
[END OF IF]
Step 4: [Copy the contents of TEMP back to ARR] SET K = 0
Step 5: Repeat while K < INDEX
SET ARR[K] = TEMP[K]
SET K = K + 1
[END OF LOOP]
Step 6: Exit
MERGE_SORT(ARR, BEG, END)

Step 1: IF BEG < END
SET MID = (BEG + END)/2
CALL MERGE_SORT (ARR, BEG, MID)
CALL MERGE_SORT (ARR, MID + 1, END)
MERGE (ARR, BEG, MID, END)
[END OF IF]
Step 2: END
*/
    
