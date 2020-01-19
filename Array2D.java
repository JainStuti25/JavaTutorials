//In this problem you have to print the largest sum among all the hourglasses in the array.

int maxVal = -1000;
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                if(i > 3 || j > 3) continue;
                
                int glassSum = 
                    arr[j][i]   + arr[j][i+1]   + arr[j][i+2]
                                + arr[j+1][i+1] +
                    arr[j+2][i] + arr[j+2][i+1] + arr[j+2][i+2];
                
                if(glassSum > maxVal) maxVal = glassSum;
            }
        }
        
        System.out.print(maxVal);
