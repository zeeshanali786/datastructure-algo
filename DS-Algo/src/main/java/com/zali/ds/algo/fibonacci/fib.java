package com.zali.ds.algo.fibonacci;

public class fib {

    public fib()
    {

        int d = fibn(8);
    }

    public int fibn( int  position)
    {
        if(position < 1 )
            return 1;


        return fibn(position-1) + fibn(position-2) ;

    }


}
