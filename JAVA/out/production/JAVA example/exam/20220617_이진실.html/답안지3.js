function solution(arr1, arr2) {
    arr1 = [[1,2], [2,3]];
    arr2 =[[3,4], [5,6]];
    let arr3 = [[],[]];
        for(let i = 0; i < arr1.length; ++i) {
            for(let j = 0; j < arr1.length; ++j) {
                arr3[i][j]=arr1[i][j]+arr2[i][j]   
            }
            
        }
        return arr3
    }