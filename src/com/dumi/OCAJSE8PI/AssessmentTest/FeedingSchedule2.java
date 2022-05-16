package com.dumi.OCAJSE8PI.AssessmentTest;

public class FeedingSchedule2 {
    public static void main(String[] args) {
        int x = 5, j = 0;
        OUTER: for(int i = 0; i < 3; )
            INNER: do {
                i++; x++;
                if(x > 10) break INNER;
                    x += 4;
                    j++;
            } while(j <= 2);
        System.out.println(x);
    }
}

// i=1 x=6 => x=10 j=1 output: 10
// i=2 x=11 =>
// i=3 x=12 => output: 12