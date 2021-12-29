package chapter04;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// ����1) ���ʴ�� x�� y�� ���� �־����� �� ��� ��и鿡 �ش�Ǵ��� ����ϵ��� �����ϼ���.
				// �� ��и鿡 �ش� �ϴ� x�� y�� ���� �Ʒ��� �����ϼ���.
				// ��1��и� : x>0, y>0
				// ��2��и� : x<0, y>0
				// ��3��и� : x<0, y<0
				// ��4��и� : x>0, y<0
				// ������ó, ����(https://www.acmicpc.net/) 14681�� ����
				System.out.println("���� 1 ");

				System.out.print("x�� �Է� : ");
				int P1_x = input.nextInt();
				System.out.print("y�� �Է� : ");
				int P1_y = input.nextInt();

				if (P1_x > 0 && P1_y > 0) {
					System.out.println(("(") + P1_x + (",") + P1_y + (")") + " = 1��и�");
				} else if (P1_x < 0 && P1_y > 0) {
					System.out.println(("(") + P1_x + (",") + P1_y + (")") + " = 2��и�");
				} else if (P1_x < 0 && P1_y < 0) {
					System.out.println(("(") + P1_x + (",") + P1_y + (")") + " = 3��и�");
				} else if (P1_x > 0 && P1_y < 0) {
					System.out.println(("(") + P1_x + (",") + P1_y + (")") + " = 4��и�");
				}
				System.out.println("-----------------------");
				// ����2) ������ �־����� �� �ش� �⵵�� ���������� Ȯ���ؼ� ����ϵ��� �ϼ���.
				// ������ ������ 4�� ����̸鼭 100�� ����� �ƴ� �� �Ǵ� 400�� ����϶��Դϴ�.
				// ���� ���, 2012���� 4�� ����̸鼭 100�� ����� �ƴ϶� �����̸�,
				// 1900���� 100�� ����̰� 400�� ����� �ƴϱ� ������ ������ �ƴմϴ�.
				// HiNT : ���� IF�� ���
				// ������ó, ����(https://www.acmicpc.net/) 2753�� ����

				System.out.println("���� 2 ");
				System.out.println("���� �ǵ���");
				int P2_year = input.nextInt();

				if ((P2_year % 4) == 0) {
					if ((P2_year % 100) != 0 || (P2_year / 400) == 0) {
						System.out.println("�����Դϴ�.");
					}
					System.out.println("������ �ƴմϴ�.");
				}
				System.out.println("-----------------------");

				// ����3) switch���� �̿��Ͽ� ����, ����, �� �� �ϳ��� �־����� �� ����� � ���� ������ �̱� �� �ִ� ���� ����ϵ���
				// �����ϼ���.
				// ���� ���, ������ �־����� �� "�̱�� ���ؼ� ������ �����մϴ�." ��� ����ϵ��� �ϼ���.
				System.out.println("���� 3  ");
				System.out.println("����������");
				String three = input.next();

				switch (three) {
				case "����":
					System.out.println("�̱�� ���ؼ� ������ �����մϴ�.");
					break;
				case "����":
					System.out.println("�̱�� ���ؼ� ���� �����մϴ�.");
					break;
				case "��":

					System.out.println("�̱�� ���ؼ� ������ �����մϴ�.");
					break;
				}
				System.out.println("-----------------------");
				// ����4) for���� "*"�� �̿��Ͽ� �Ʒ��� ���� ����ϵ��� �ϼ���.
				// *
				// **
				// ***
				// ****
				// *****
				System.out.println("���� 4");
				String P4_x = "*", result = "";
				System.out.println("* ���� ������ �Է��Ͻÿ� : ");
				int P4_y = input.nextInt();
				for (int i = 1; i <= P4_y; i++) {
					System.out.println(result += P4_x);
				}
				System.out.println("-----------------------");
				// ����5) ���ʴ�� m�� n�� �Է¹޾� m���� n��°���� ����ϵ��� �ϼ���.
				// ���� ��� 2�� 3�� �Է¹޾��� ��� �Ʒ�ó�� ����մϴ�.
				// 2 X 1 = 2
				// 2 X 2 = 4
				// 2 X 3 = 6
				System.out.println("���� 5");
				System.out.print("m���� �Է� : ");
				int m = input.nextInt();
				System.out.print("n���� �Է� : ");
				int n = input.nextInt();
				int mn = 0;
				for (int i = 1; i<=n  ; i++) {
					System.out.printf("%d * %d = %d \n" ,m,i,m*i);

				}
	}

}
