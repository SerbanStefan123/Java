        import java.util.Scanner;

        public class Main
        {
            public static void main(String[] args) {
                long inceput = System.nanoTime();
                Scanner scanner = new Scanner(System.in);
                int n, k,nrMuchii=0,gradMaxim=0,gradMinim=9999999,gradTotal=0;
                n = scanner.nextInt(); k = scanner.nextInt();
                scanner.close();
                int[][] graf=new int[n][n];
                int[] grad = new int [n];

                for(int i=0;i<n;i++){
                    for(int j=i+1;j<n;j++){
                        int random = (int)(Math.random() * 101);
                        if(i==j)
                            graf[i][j]=0;
                        else if(random <= 33){
                            graf[i][j]=1;
                            graf[i][j]=1;
                            nrMuchii++;
                            grad[i]++;
                            grad[j]++;
                        }   
                        else{
                            graf[i][j]=0;
                            graf[j][i]=0;
                        }
                    } 
                }
                for(int i=0;i<n;i++){
                    gradMaxim = Math.max(gradMaxim, grad[i]);
                    gradMinim = Math.min(gradMinim, grad[i]);
                    gradTotal += grad[i];
                }

                long sfarsit = System.nanoTime();
                long durata = (sfarsit - inceput) / 1_000_000; 

                if(n <= 30){
                    for(int i=0;i<n;i++){
                        for(int j=0;j<n;j++){
                            if(graf[i][j]==1 || graf[j][i]==1)
                                System.out.print("■" + " ");
                            else
                                System.out.print("□" + " ");
                        }
                        System.out.println();
                    }
                }
                System.out.println("Numarul de muchii: " + nrMuchii);
                System.out.println("Gradul maxim(Δ): " + gradMaxim);
                System.out.println("Gradul minim(δ): " + gradMinim);
                if(gradTotal==nrMuchii*2)
                    System.out.println("Verificare suma gradelor = 2*m => TRUE");
                else
                    System.out.println("Verificare suma gradelor = 2*m => FALSE");
                if(n>30)
                    System.out.println("Timpul de rulare: " + durata + " ms");
            }
        }
