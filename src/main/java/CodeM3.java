import java.util.Scanner;
public class CodeM3 {
    public static double a[][] = {{0.000,0.133,0.210,0.292,0.670,0.270,0.953,0.353,0.328,0.128,0.873,0.082,0.771,0.300,0.405,0.455},
                                {0.867,0.000,0.621,0.384,0.934,0.847,0.328,0.488,0.785,0.308,0.158,0.774,0.923,0.261,0.872,0.924},
                                {0.790,0.379,0.000,0.335,0.389,0.856,0.344,0.998,0.747,0.895,0.967,0.383,0.576,0.943,0.836,0.537},
                                {0.708,0.616,0.665,0.000,0.146,0.362,0.757,0.942,0.596,0.903,0.381,0.281,0.294,0.788,0.804,0.655},
                                {0.330,0.066,0.611,0.854,0.000,0.687,0.983,0.217,0.565,0.293,0.256,0.938,0.851,0.487,0.190,0.680},
                                {0.730,0.153,0.144,0.638,0.313,0.000,0.832,0.526,0.429,0.707,0.414,0.617,0.925,0.638,0.526,0.545},
                                {0.047,0.672,0.656,0.243,0.017,0.168,0.000,0.357,0.125,0.307,0.879,0.551,0.641,0.959,0.981,0.465},
                                {0.647,0.512,0.002,0.058,0.783,0.474,0.643,0.000,0.325,0.494,0.893,0.064,0.563,0.429,0.501,0.872},
                                {0.672,0.215,0.253,0.404,0.435,0.571,0.875,0.675,0.000,0.940,0.053,0.329,0.232,0.280,0.359,0.474},
                                {0.872,0.692,0.105,0.097,0.707,0.293,0.693,0.506,0.060,0.000,0.040,0.776,0.589,0.704,0.018,0.968},
                                {0.127,0.842,0.033,0.619,0.744,0.586,0.121,0.107,0.947,0.960,0.000,0.486,0.266,0.662,0.374,0.698},
                                {0.918,0.226,0.617,0.719,0.062,0.383,0.449,0.936,0.671,0.224,0.514,0.000,0.821,0.027,0.415,0.227},
                                {0.229,0.077,0.424,0.706,0.149,0.075,0.359,0.437,0.768,0.411,0.734,0.179,0.000,0.841,0.409,0.158},
                                {0.700,0.739,0.057,0.212,0.513,0.362,0.041,0.571,0.720,0.296,0.338,0.973,0.159,0.000,0.935,0.765},
                                {0.595,0.128,0.164,0.196,0.810,0.474,0.019,0.499,0.641,0.982,0.626,0.585,0.591,0.065,0.000,0.761},
                                {0.545,0.076,0.463,0.345,0.320,0.455,0.535,0.128,0.526,0.032,0.302,0.773,0.842,0.235,0.239,0.000}};
    public static double result[] = new double[16];
    public static void main(String[] args) {
        predict(a,result);
    }
    public static void predict(double a[][], double result[]){
        double num;
        num = a[0][1]*(a[0][4]*a[4][5]+a[0][5]*a[5][4])*(
                 a[0][8]*a[8][9]*(a[8][10]*a[10][11]+a[8][11]*a[11][10])
                +a[0][9]*a[9][8]*(a[9][12]*a[12][13]+a[9][13]*a[13][12])+
                a[0][12]*a[12][13]*(a[12][8]*a[8][9]+a[12][9]*a[9][8])+
                a[0][13]*a[13][12]*(a[13][8]*a[8][9]+a[13][9]*a[9][8]));
        double data[] = new double[8];
        int level[] = new int[16];
        for(int i=0;i<16;i++){
            level[i]=0;
        }
        for(int i=0;i<1;i++){
            while(level[i]<=5){
                if(level[i]==0){
                    if(i%2==0){
                        data[i] = a[i][i+1];
                    }else{
                        data[i] = a[i][i-1];
                    }
                }
                for(int j=0;j<level[i];j++){

                }
            }
        }
        System.out.println(num);
//        for(int i=0;i<16;i++){
//            result[i]=0;
//        }
    }
}