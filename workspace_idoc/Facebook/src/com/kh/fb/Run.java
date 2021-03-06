package com.kh.fb;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FacebookDAO dao = FacebookDAO.getInstance();

		login: while (true) {
			System.out.println("Facebook 프로그램");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("0. 프로그램 종료");
			System.out.print(">> ");
			int menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) { // 로그인

				System.out.print("id 입력 >> ");
				String Id = sc.nextLine();
				System.out.print("pw 입력 >> ");
				String Pw = sc.nextLine();
				try {
					if (dao.Login(Id, Pw)) {
						String Nickname = dao.getNickname(Id);
						System.out.println("로그인 성공");
						System.out.println("*** " + Nickname + "님 환영합니다 ***\n");

						while (true) {
							System.out.println("1. 포스트 등록");
							System.out.println("2. 포스트 목록");
							System.out.println("3. 포스트 확인");
							System.out.println("4. 포스트 수정");
							System.out.println("5. 포스트 삭제");
							System.out.println("6. 로그아웃");
							System.out.print(">> ");
							int pmenu = Integer.parseInt(sc.nextLine());

							if (pmenu == 1) { // insert

								try {
									System.out.println("=== 포스트 등록 ===");
									while (true) {
										System.out.print("타이틀(10자 이내) >> ");
										String title = sc.nextLine();
										if (title.length() > 10) {
											System.out.println("타이틀은 10자 이내로 입력하세요.");
										} else {
											System.out.print("내용(100자 이내) >> ");
											String memo = sc.nextLine();
											if (memo.length() > 100) {
												System.out.println("내용은 100자 이내로 입력하세요.");
											} else {
												PostDTO dto = new PostDTO(0, Nickname, title, null, memo);
												int rs = dao.insert(dto);

												if (rs > 0) {
													System.out.println("포스트 등록 완료\n");

												} else {
													System.out.println("포스트 등록 실패\n");
												}
												break;
											}
										}
									}

								} catch (Exception e) {
									e.printStackTrace();
									System.out.println("너무 길어");

								}

							} else if (pmenu == 2) { // selectAll 목록
								System.out.println("==== 포스트 목록==== ");
								System.out.println("글번호 \t타이틀 \t닉네임 \t등록일");
								try {
									ArrayList<PostDTO> list = dao.selectAll();
									if (list != null) {
										for (PostDTO dto : list) {
											System.out.println(dto.toString());
											System.out.println("\n");
										}
									} else {
										System.out.println("포스트 목록을 불러오지 못했습니다.");
									}
								} catch (Exception e) {
									e.printStackTrace();
									System.out.println("오류");
								}

							} else if (pmenu == 3) { // select 확인

								

								while (true) {
									ArrayList<PostDTO> list = dao.selectAll();
									if (list != null) {
										for (PostDTO dto : list) {
											System.out.println(dto.toString());
										}
									} else {
										System.out.println("포스트 목록을 불러오지 못했습니다.");
									}
									
									System.out.print("확인할 포스트의 번호를 입력하세요 >> ");
									int num = Integer.parseInt(sc.nextLine());

									PostDTO dto = dao.select(num);
									System.out.println("=== 포스트 확인 ===");
									System.out.println("글번호\t" + dto.getNo());
									System.out.println("닉네임\t" + dto.getNickname());
									System.out.println("등록일\t" + dto.getTitle());
									System.out.println("내용\t" + dto.getMemo());

									try {// selectAll_C

										ArrayList<CommentDTO> list2 = dao.selectAll_c(num);
										System.out.println("=== 댓글 목록 ===");
										System.out.println("댓글 내용\t닉네임\t작성일");
										if (list != null) {
											for (CommentDTO cdto : list2) {
												
												System.out.println(cdto.toString());
											}
										} else {
											System.out.println("데이터 조회 실패");
										}

									} catch (Exception e) {
										e.printStackTrace();
									}

									System.out.println("\n1. 댓글 등록");
									System.out.println("2. 메뉴로 돌아가기");
									System.out.print(">> ");
									int menu_c = Integer.parseInt(sc.nextLine());

									if (menu_c == 1) {
										System.out.print("댓글 입력(50자 이내) >> ");
										String com = sc.nextLine();

										int rs = dao.insert_C(num, com, Nickname);
										if (rs > 0) {
											System.out.println("댓글이 등록되었습니다.\n");
										} else {
											System.out.println("댓글 등록이 실패되었습니다.\n");
										}
									} else if (menu_c == 2) {
										break;
									}

								}

								// 댓글등록,메뉴로돌아가기

							} else if (pmenu == 4) { // update 수정
								// 포스트목록
								System.out.println("=== 포스트 목록 ===");
								// 포스트목록불러오기
								System.out.print("수정할 포스트의 번호를 입력하세요 >> ");
								int no = Integer.parseInt(sc.nextLine());
								System.out.print("수정할 타이틀(10자 이내) >> ");
								String title = sc.nextLine();
								System.out.print("수정할 내용(100자 이내) >> ");
								String memo = sc.nextLine();

								PostDTO dto2 = new PostDTO(no, null, title, null, memo);
								int rs = dao.update(dto2);
								if (rs > 0) {
									System.out.println("포스트 수정 완료\n");
								}

							} else if (pmenu == 5) { // delete 삭제

								System.out.print("삭제할 포스트의 번호를 입력하세요 >> ");
								int no = Integer.parseInt(sc.nextLine());

								System.out.print("정말 삭제하시겠습니까 ? (Y/N) >> ");
								String select = sc.nextLine();
								if (select.equals("Y")||select.equals("y")) {
									try {
										int rs = dao.delete(no);

										if (rs > 0) {
											System.out.println("삭제가 완료되었습니다.\n");
										}

									} catch (Exception e) {
										e.printStackTrace();
										System.out.println("DB 접속이 불안정합니다.");
									}
								} else if (select.equals("N")||select.equals("n")) {
									System.out.println("삭제가 취소 되었습니다.\n");
								}

							} else if (pmenu == 6) {// 로그아웃
								System.out.println("\n");
								break;

							}

						}
					}else {
						System.out.println("아이디 혹은 비밀번호가 일치하지 않습니다.");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			} else if (menu == 2) { // 회원가입
				String Id = null;
				String Nickname = null;

				while (true) {
					System.out.print("id 입력 >> ");
					Id = sc.nextLine();
					try {
						if (dao.check_id(Id)) {
							System.out.println("사용가능한 아이디입니다.");
							break;
						} else {
							System.out.println("존재하는 아이디입니다. 다른 아이디를 사용하세요");
							continue;
						}
					} catch (Exception e) {
						e.printStackTrace();
					}

				}

				System.out.print("pw 입력 >> ");
				String Pw = sc.nextLine();

				while (true) {
					System.out.print("nickname 입력 >> ");
					Nickname = sc.nextLine();
					try {
						if (dao.check_nickname(Nickname)) {
							System.out.println("사용가능한 닉네임입니다.");
							break;
						} else {
							System.out.println("존재하는 닉네임입니다. 다른 닉네임을 사용하세요");
							continue;
						}
					} catch (Exception e) {
						e.printStackTrace();
					}

				}

				try {
					int rs = dao.Id_join(new FacebookDTO(Id, Pw, Nickname));
					if (rs > 0) {
						System.out.println("회원가입에 성공하였습니다.\n");
						continue;
					} else {
						System.out.println("회원가입에 실패하였습니다.\n");
					}
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("오류가 발생하였습니다.\n");
				}
				break;

			} else if (menu == 0) { // 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				break login;
			} else {
				System.out.println("번호를 다시 입력하세요");
			}

		}

	}
}