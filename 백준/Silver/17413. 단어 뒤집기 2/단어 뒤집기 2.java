

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        StringBuilder sb = new StringBuilder();
        Deque<Character> stack = new ArrayDeque<>();

        boolean onTage = false; //태그 시작 알림

        for(int i=0; i<str.length();i++) {
            char c = str.charAt(i); //문자 하나씩 추출

            //태그 시작인 경우
            if ( c == '<'){
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
                sb.append(c);
                onTage = true;
            }
            else if( c == '>'){ //괄호 닫힐 때
                sb.append(c);
                onTage = false;
            }
            else if(onTage){ //괄호 안 문자일 떄
                sb.append(c);
            }

            else { //태그 아닌 문자일때

                //공백 만났을 시
                if(c == ' '){
                    while(!stack.isEmpty()){
                        sb.append(stack.pop());
                    }
                    sb.append(" ");
                }else{
                    stack.push(c);
                }

                //마지막 문장인 경우
                if(i==str.length()-1){
                    while (!stack.isEmpty()){
                    sb.append(stack.pop());
                    }
                }
            }

        }
        System.out.println(sb);
        }



    }
