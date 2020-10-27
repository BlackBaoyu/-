package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //創建scanner
        Scanner scanner = new Scanner(System.in);

        //設立位置
        char [] pos = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

        //設立符號
        char mark = 'X';
        int location;

        //記數
        int count = 0;

        //輸入位置
        while(true){
            //如果有重複，再問一次問題
            do{
                System.out.print("請輸入位置:");
                location = scanner.nextInt();
            }while(pos[location - 1] == 'X' || pos[location - 1] == 'O');

            //寫上符號
            pos[location - 1] = mark;

            //印製表格
            System.out.println(" "+ pos[0] + " | " + " "+ pos[1] + " | " + " " + pos[2]);
            System.out.println("---|----|--- ");
            System.out.println(" "+ pos[3] + " | " + " "+ pos[4] + " | " + " " + pos[5]);
            System.out.println("---|----|--- ");
            System.out.println(" "+ pos[6] + " | " + " "+ pos[7] + " | " + " " + pos[8]);

            //勝利定義
            if(pos[0] == mark && pos[3] == mark && pos[6] == mark||
               pos[1] == mark && pos[4] == mark && pos[7] == mark||
               pos[2] == mark && pos[5] == mark && pos[8] == mark||
               pos[0] == mark && pos[1] == mark && pos[2] == mark||
               pos[3] == mark && pos[4] == mark && pos[5] == mark||
               pos[6] == mark && pos[7] == mark && pos[8] == mark||
               pos[0] == mark && pos[4] == mark && pos[8] == mark||
               pos[2] == mark && pos[4] == mark && pos[6] == mark){
                System.out.println(mark + "贏了。");
                break;
            }

            //換方
            if(mark == 'X'){
                mark = 'O';
            }
            else if(mark == 'O'){
                mark = 'X';
            }

            //和局定義
            count = count + 1;
            if(count == 9){
                System.out.println("和局");
                break;
            }
        }

    }
}
