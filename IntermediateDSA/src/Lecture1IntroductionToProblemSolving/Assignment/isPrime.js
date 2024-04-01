module.exports = {
    //param A : integer
    //return an integer
    solve : function(A){
        if (A === 1) return 0;
        for (let i = 2 ; i <= Math.sqrt(A) ; i++) {
            if (A % i === 0) {
                return 0 ;
            }
        }
        return 1 ;
    }
};
