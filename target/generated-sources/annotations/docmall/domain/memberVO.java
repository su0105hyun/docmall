package docmall.domain;

@ToString
@Setter
@Getter
public class memberVO {
	/*
	CREATE TABLE MBSP_TBL(

	        mbsp_id             varchar2(15),

	        mbsp_name           varchar2(30)            not null,

	        mbsp_email          varchar2(50)            not null,

	        mbsp_password       char(60)               not null,        -- 비밀번호 암호화 처리.

	        mbsp_zipcode        char(5)                 not null,

	        mbsp_addr           varchar2(100)            not null,

	        mbsp_deaddr         varchar2(100)            not null,

	        mbsp_phone          varchar2(15)            not null,

	        mbsp_point          number default 0        not null,

	        mbsp_lastlogin      date default sysdate    not null,

	        mbsp_datesub        date default sysdate    not null,

	        mbsp_updatedate     date default sysdate    not null

	);
	*/
	// 멤버필드
	private String 	mbsp_id;
	private String 	mbsp_name;
	private String 	mbsp_email;
	private String 	mbsp_password;
	private String 	mbsp_zipcode;
	private String 	mbsp_addr;
	private String 	mbsp_deaddr;
	private String 	mbsp_phone;
	private int 	mbsp_point;
	private Date	mbsp_lastlogin;
	private Date	mbsp_datesub;
	private Date	mbsp_updatedate;
	
}




