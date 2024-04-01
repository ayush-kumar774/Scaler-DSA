module.exports = {
    //param A : integer
    //return an integer
    solve : function(A){
        let counter = 0;
        for (let i = 1; i <= Math.sqrt(A); i++) {
            if (A %  i === 0) {
                if (i === A / i) counter++ ;
                else  counter += 2;
            }
        }
        return counter;
    }
};
