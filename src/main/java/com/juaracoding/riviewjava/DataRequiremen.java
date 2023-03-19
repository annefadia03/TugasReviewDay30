package com.juaracoding.riviewjava;

public class DataRequiremen {
    public static void main(String[] args) {
        String data[][] = new String[3][2];

        data[0][0] = ":T1:202112SOAL3";
        data[0][1] = ":T2:SOAL3/2112/AB000000011 OD:0001234500CDE5432100 SOAL003 ABCDE12345 XAS SKILL TEST ESSAY .DT";

        data[1][0] = ":T1:202111SOAL3";
        data[1][1] = ":T2:SOAL3/2111/BC000011100 OD:0003452100EFG2451300 SOAL003 EFGHI25134 XAS SKILL TEST ESSAY .DT";

        data[2][0] = ":T1:202110SOAL3";
        data[2][1] = ":T2:SOAL3/2110/DE210031010 OD:0001524300HIJ2145300 SOAL003 JKLMN52431 XAS SKILL TEST ESSAY .DT";

        String trailer[] = new String[6];

        for (int i = 0; i < 3; i++) {
            trailer[0] = data[i][1].substring(0, 4);
            for (int j = 1; j <= 5; j++) {
                trailer[j] = data[i][1].substring((18 * (j - 1) + 4), (18 * (j - 1) + 22));
            }

            data[i][1] = trailer[0].concat(trailer[3]).concat(trailer[4]).concat(trailer[5]).concat(trailer[1]).concat(trailer[2]);

            System.out.println(data[i][0]);
            System.out.println(data[i][1]);
            System.out.println();
        }
    }
}
