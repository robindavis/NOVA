import javax.swing.*;//For GUI Components
import java.awt.*;//For GUI Components
import java.util.*;//For Thread.sleep
import java.util.Date;//For Date and Time
import java.awt.event.*;//For Event Handling
import java.io.*;//For Input from the User in command prompt
////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////
interface basic
{JFrame f1=new JFrame("N.O.V.A");
JPanel p1=new JPanel();
JMenuBar mb=new JMenuBar();
String abc2=""+(char)(67)+(char)(114)+(char)(101)+(char)(97)+(char)(116)+(char)(111)+(char)(114)+(char)(115);
String abc=""+(char)(82)+(char)(79)+(char)(66)+(char)(73)+(char)(78);
String abc1=""+(char)(68)+(char)(65)+(char)(86)+(char)(73)+(char)(83);
String bcd=""+(char)(83)+(char)(72)+(char)(65)+(char)(82)+(char)(79)+(char)(78);
String bcd1=""+(char)(86)+(char)(65)+(char)(76)+(char)(65)+(char)(80)+(char)(73)+(char)(76)+(char)(76)+(char)(65);
JMenu m1=new JMenu("<"+abc2+">");
JMenuItem mit1=new JMenuItem(abc+" "+abc1);
JMenuItem mit2=new JMenuItem(bcd+" "+bcd1);
JMenu m2=new JMenu("For Help Mail to:");
JMenuItem mit3=new JMenuItem("robin.dvs007@gmail.com");
JMenuItem mit4=new JMenuItem("sharonv35@gmail.com");
JButton ref=new JButton("REFRESH");
JButton ex=new JButton("Exit");
JPasswordField t1=new JPasswordField(10);
JButton b1=new JButton("Login");
JTextField date2=new JTextField(10);
JLabel l2=new JLabel("Password:");
/*void hidden()
{p1.setBackground(Color.black);
p1.setLayout(null);
f1.getContentPane().add(p1);
f1.setSize(500,500);
f1.setVisible(true);
String os=System.getProperty("os.name");
Date date1=new Date();
String date=date1.toString();
JLabel os1=new JLabel(os);os1.setForeground(Color.red);os1.setBounds(50,414,100,25);
JLabel date2=new JLabel(date);date2.setForeground(Color.red);
date2.setBounds(50,417,100,25);
p1.add(os1);
p1.add(date2);
}*/
}
////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////
class timer
{void time(int i)
{try{Thread.sleep(i);}
catch(Exception e){}}}
/*USAGE: timer obj=new timer(); obj.time(___<put time value in seconds>__);*/
////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////
class startup implements basic,ActionListener
{timer obj1=new timer();
int i=0,j=0;
void frame()
{p1.setBackground(Color.black);
f1.getContentPane().add(p1);
for(i=200;i<=500;i++)
{f1.setVisible(true);
f1.setSize(i,i);}}
void msg()
{p1.setBackground(Color.black);
p1.setLayout(null);
f1.getContentPane().add(p1);
f1.setSize(500,500);
f1.setVisible(true);
ImageIcon ic=new ImageIcon("1.gif");
JLabel temp=new JLabel(ic);temp.setBounds(100,100,300,200);
p1.add(temp);
for(i=1;i<=460;i++)
{String a="__";
Font fo=new Font("Verdana",Font.BOLD,21);
JLabel l1=new JLabel(a);l1.setFont(fo);
l1.setForeground(Color.green);l1.setBounds(i,10,90,30);
p1.add(l1);
JLabel l2=new JLabel(a);l2.setFont(fo);
l2.setForeground(Color.green);
l2.setBounds(i,20,90,30);
p1.add(l2);
JLabel l3=new JLabel(a);l3.setFont(fo);
l3.setForeground(Color.green);
l3.setBounds(i,60,90,30);
p1.add(l3);
JLabel l4=new JLabel(a);l4.setFont(fo);
l4.setForeground(Color.green);
l4.setBounds(i,70,90,30);
p1.add(l4);
JLabel l5=new JLabel(a);l5.setFont(fo);
l5.setForeground(Color.blue);
l5.setBounds(i,430,90,40);
p1.add(l5);
JLabel l6=new JLabel(a);l6.setFont(fo);
l6.setForeground(Color.blue);
l6.setBounds(i,1,90,40);
p1.add(l6);
JLabel l7=new JLabel(a);l7.setFont(fo);
l7.setForeground(Color.blue);
l7.setBounds(i,400,90,40);
p1.add(l7);
}
for(j=1;j<=440;j++)
{String a="|";
JLabel l1=new JLabel(a);
Font fo=new Font("Verdana",Font.BOLD,21);l1.setFont(fo);
l1.setForeground(Color.blue);
l1.setBounds(1,j,100,25);
p1.add(l1);
JLabel l2=new JLabel(a);
l2.setFont(fo);
l2.setForeground(Color.blue);
l2.setBounds(475,j,100,25);
p1.add(l2);
}f1.setVisible(true);f1.setSize(500,500+(j%2));
Font fo=new Font("Verdana",Font.BOLD,21);
String a1="N . O . V . A";
JLabel l1=new JLabel(a1);l1.setForeground(Color.red);l1.setBounds(175,50,200,32);l1.setFont(fo);
l1.setToolTipText("[Program Name]");
p1.add(l1);
obj1.time(3000);/// Loading Time Adjustment
f1.setVisible(true);f1.setSize(500,500+(j%2));
temp.setVisible(false);
/*	LOADING COMPLETE	*/
mb.setBackground(Color.gray);
m2.setForeground(Color.red);
m1.setForeground(Color.red);
mit1.setForeground(Color.red);
mit2.setForeground(Color.red);
mit1.setBackground(Color.gray);
mit2.setBackground(Color.gray);
mit3.setForeground(Color.red);
mit4.setForeground(Color.red);
mit3.setBackground(Color.gray);
mit4.setBackground(Color.gray);
m1.setToolTipText("[List of Creators]");
m2.setToolTipText("[Email Id's of Creators]");
m1.add(mit1);
m1.add(mit2);
m2.add(mit3);
m2.add(mit4);
mb.add(m1);
mb.add(m2);
f1.setJMenuBar(mb);
f1.setSize(500,500);
f1.setVisible(true);
String os=System.getProperty("os.name");
JLabel os1=new JLabel(os);os1.setForeground(Color.red);os1.setBounds(10,435,100,23);
Date date1=new Date();
String date=date1.toString();
date2.setForeground(Color.red);date2.setBackground(Color.black);
date2.setBounds(115,438,175,20);
ref.setBackground(Color.blue);ref.setForeground(Color.cyan);
ref.setBounds(310,440,92,15);
ex.setBounds(405,440,65,15);ex.setForeground(Color.cyan);
ex.setBackground(Color.blue);
ex.addActionListener(this);
ex.setToolTipText("[Click to Exit the Program]");
ref.setToolTipText("[Click to Refresh Time & Date]");
os1.setToolTipText("[Current Operating System]");
p1.add(ex);
p1.add(os1);
p1.add(date2);date2.setText(date);
ref.addActionListener(this);
p1.add(ref);
f1.setVisible(true);f1.setSize(500,501);

l2.setFont(fo);l2.setForeground(Color.cyan);

b1.setFont(fo);b1.setForeground(Color.cyan);b1.setBackground(Color.blue);
b1.setToolTipText("[Click to Login]");
t1.setEchoChar('*');
t1.setFont(fo);t1.setBackground(Color.gray);t1.setForeground(Color.green);
l2.setBounds(100,100,300,200);
t1.setBounds(230,190,150,25);
b1.setBounds(230,230,100,25);
p1.add(l2);
p1.add(t1);
p1.add(b1);
f1.setVisible(true);f1.setSize(500,525);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==ref)//Refresh Button
{Date date1=new Date();
String date=date1.toString();
date2.setText(date);
f1.setVisible(true);
f1.setSize(500,525);}
else if(e.getSource()==ex)//Exit Button
{JOptionPane.showMessageDialog(f1,"---------------------------------------------\nTHANK YOU FOR USING N.O.V.A\nVersion 1.0\n---------------------------------------------");
shutdown obj1=new shutdown();obj1.sd();}
}
public static void start()
{startup obj1=new startup();
obj1.frame();
obj1.msg();
}}
////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////
class systray implements basic,ActionListener,MouseListener,MouseMotionListener
{JLabel y1,w1,w3,w9,w18,w20,t3,t9,t14,tt1;
JCheckBox w2,w5,w6,w8,w11,w12,w14,w15,w16,w17,w22,t2,t5,t8,t11,t12,t6;
JTextField w4,w7,w10,w13,w19,w21,w23,t4,t7,t10,t13,t15;
JButton y5,op1,op2,op3,op4;
JTextArea y2;
JScrollPane sc;
JLabel tmp1,tmp2,m1,m2,m4,m6,m7,m9,m11;
String fn1="",sl1="",word="",fn2="",sl2="",nfn="";
int painttype=0,gr=0,fm=0,pt=0,opentype=0,nl=0,opentypem=0;
int fx=15,fy=105;
JButton cpy,bk;
JTextField m3,m5,m8,m10;
JCheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14;
String base="",front="";
int temp=0,temp1=0,temp2=0;
JPanel p2=new JPanel();//Drawing Pad
ImageIcon ic=new ImageIcon("2.GIF");
JLabel l3=new JLabel(ic);
JButton b4=new JButton("File Manager");
ImageIcon ic2=new ImageIcon("4.jpg");
JLabel l5=new JLabel(ic2);
JButton b2=new JButton("Paint");
ImageIcon ic1=new ImageIcon("3.GIF");
JLabel l4=new JLabel(ic1);
JButton b3=new JButton("Exit &\n Run Dos");
int i=3,key=0;
void log()
{b1.addActionListener(this);
if(key==1)
{t1.setVisible(false);
b1.setVisible(false);
l2.setVisible(false);

l3.setBounds(35,105,73,66);l3.setToolTipText("[Paint Image]");
b2.setForeground(Color.cyan);b2.setBackground(Color.blue);
b2.setToolTipText("[Paint]");
b2.addActionListener(this);
b2.setBounds(45,175,65,20);

l5.setBounds(43,295,72,45);l5.setToolTipText("[File Management Image]");
b4.setForeground(Color.cyan);b4.setBackground(Color.blue);
b4.setToolTipText("[File Manager]");
b4.addActionListener(this);

b4.setBounds(25,345,110,20);

f1.setVisible(true);
f1.setSize(500,526);
l4.setBounds(30,200,90,65);l4.setToolTipText("[Warning Image]");
b3.setForeground(Color.cyan);b3.setBackground(Color.blue);
b3.setToolTipText("[Exit to Command Prompt]");
b3.addActionListener(this);
b3.setBounds(20,260,120,20);
p1.add(l4);
p1.add(b3);
p1.add(l3);
p1.add(b2);
p1.add(l5);
p1.add(b4);


}
}
void log2()
{p2.setLayout(null);
p2.setBounds(15,105,455,200);
if(base.equals(""))
{p2.setBackground(Color.white);}

if(pt==0)
{pt=1;
	p1.add(p2);
	p1.addMouseMotionListener(this);
	p1.addMouseListener(this);
	tmp1=new JLabel("Background Color");
	tmp1.setBounds(15,305,105,20);tmp1.setForeground(Color.red);
	tmp1.setToolTipText("Select Background Color");
	p1.add(tmp1);
	cb1=new JCheckBox("Blue");
	cb1.setBounds(15,327,60,20);cb1.setForeground(Color.cyan);cb1.setBackground(Color.blue);
	cb1.setToolTipText("Click to change to Blue");
	cb2=new JCheckBox("Green");
	cb2.setBounds(15,347,60,20);cb2.setForeground(Color.cyan);cb2.setBackground(Color.blue);
	cb2.setToolTipText("Click to change to Green");
	cb3=new JCheckBox("Red");
	cb3.setBounds(15,367,60,20);cb3.setForeground(Color.cyan);cb3.setBackground(Color.blue);
	cb3.setToolTipText("Click to change to Red");
	cb4=new JCheckBox("Black");
	cb4.setBounds(15,387,60,20);cb4.setForeground(Color.cyan);cb4.setBackground(Color.blue);
	cb4.setToolTipText("Click to change to Balck");
	cb5=new JCheckBox("White");
	cb5.setBounds(15,407,60,20);cb5.setForeground(Color.cyan);cb5.setBackground(Color.blue);
	cb5.setToolTipText("Click to change to White");
	ButtonGroup bg=new ButtonGroup();
	bg.add(cb1);
	bg.add(cb2);
	bg.add(cb3);
	bg.add(cb4);
	bg.add(cb5);
	p1.add(cb1);
	p1.add(cb2);
	p1.add(cb3);
	p1.add(cb4);
	p1.add(cb5);


	tmp2=new JLabel("Foreground Color");
	tmp2.setBounds(125,305,100,20);tmp2.setForeground(Color.red);
	tmp2.setToolTipText("Select Foreground Color");
	p1.add(tmp2);
	cb6=new JCheckBox("Blue");
	cb6.setBounds(125,327,60,20);cb6.setForeground(Color.cyan);cb6.setBackground(Color.blue);
	cb6.setToolTipText("Click to change to Blue");
	cb7=new JCheckBox("Green");
	cb7.setBounds(125,347,60,20);cb7.setForeground(Color.cyan);cb7.setBackground(Color.blue);
	cb7.setToolTipText("Click to change to Green");
	cb8=new JCheckBox("Red");
	cb8.setBounds(125,367,60,20);cb8.setForeground(Color.cyan);cb8.setBackground(Color.blue);
	cb8.setToolTipText("Click to change to Red");
	cb9=new JCheckBox("Black");
	cb9.setBounds(125,387,60,20);cb9.setForeground(Color.cyan);cb9.setBackground(Color.blue);
	cb9.setToolTipText("Click to change to Black");
	cb10=new JCheckBox("White");
	cb10.setBounds(125,407,60,20);cb10.setForeground(Color.cyan);cb10.setBackground(Color.blue);
	cb10.setToolTipText("Click to change to White");
	ButtonGroup bg1=new ButtonGroup();
	bg1.add(cb6);
	bg1.add(cb7);
	bg1.add(cb8);
	bg1.add(cb9);
	bg1.add(cb10);
	p1.add(cb6);
	p1.add(cb7);
	p1.add(cb8);
	p1.add(cb9);
	p1.add(cb10);
	cb1.addActionListener(this);
	cb2.addActionListener(this);
	cb3.addActionListener(this);
	cb4.addActionListener(this);
	cb5.addActionListener(this);
	cb6.addActionListener(this);
	cb7.addActionListener(this);
	cb8.addActionListener(this);
	cb9.addActionListener(this);
	cb10.addActionListener(this);
	m1=new JLabel("Mouse Co-ordinates:");m1.setForeground(Color.red);
	m1.setBounds(230,305,130,20);
	m1.setToolTipText("Shows Mouse Current Location");
	m2=new JLabel("X=");m2.setForeground(Color.green);
	m2.setBounds(230,320,20,20);
	m2.setToolTipText("X co-ordinate of Mouse");
	m3=new JTextField(10);m3.setBackground(Color.black);m3.setForeground(Color.green);
	m3.setBounds(245,325,35,15);
	m4=new JLabel("Y=");m4.setForeground(Color.green);
	m4.setBounds(290,320,20,20);
	m4.setToolTipText("Y co-ordinate of Mouse");
	m5=new JTextField(10);m5.setBackground(Color.black);m5.setForeground(Color.green);
	m5.setBounds(305,325,35,15);
	p1.add(m1);
	p1.add(m2);
	p1.add(m3);
	p1.add(m4);
	p1.add(m5);
	m6=new JLabel("Paint Type:");m6.setForeground(Color.red);
	m6.setBounds(230,340,130,20);
	m6.setToolTipText("Select Paint Type");
	cb11=new JCheckBox("3d Line");
	cb11.setBounds(230,360,90,20);
	cb11.setForeground(Color.cyan);cb11.setBackground(Color.blue);
	cb11.setToolTipText("Click to change to 3d Line");

	cb12=new JCheckBox("Spray Paint");
	cb12.setBounds(230,380,90,20);cb12.setForeground(Color.cyan);cb12.setBackground(Color.blue);
	cb12.setToolTipText("Click to change to Spray Painting");

	cb13=new JCheckBox("Fixed Point");
	cb13.setBounds(230,400,90,20);cb13.setForeground(Color.cyan);cb13.setBackground(Color.blue);
	cb13.setToolTipText("Click to change to Fixed Point");
	m7=new JLabel("X=");
	m7.setForeground(Color.green);
	m7.setBounds(343,397,15,15);
	m7.setToolTipText("X co-ordinate for Fixed Point");
	ButtonGroup bg2=new ButtonGroup();
	m8=new JTextField(10);m8.setBackground(Color.black);m8.setForeground(Color.green);
	m8.setBounds(358,397,35,15);
	m9=new JLabel("Y=");
	m9.setForeground(Color.green);
	m9.setBounds(343,413,15,15);
	m9.setToolTipText("Y co-ordinate for Fixed Point");
	m10=new JTextField(10);m10.setBackground(Color.black);m10.setForeground(Color.green);
	m10.setBounds(358,413,35,15);
	m11=new JLabel("=>");m11.setForeground(Color.green);
	m11.setBounds(320,405,130,20);
	cb14=new JCheckBox("Normal");
	cb14.setBounds(320,360,90,20);cb14.setForeground(Color.cyan);cb14.setBackground(Color.blue);
	cb14.setToolTipText("Click to change to Normal");
	bg2.add(cb11);
	bg2.add(cb12);
	bg2.add(cb13);
	bg2.add(cb14);
	p1.add(m6);
	p1.add(cb11);
	p1.add(cb12);
	p1.add(cb13);
	p1.add(cb14);
	p1.add(m7);
	p1.add(m8);
	p1.add(m9);
	p1.add(m10);
	p1.add(m11);
	cb11.addActionListener(this);
	cb12.addActionListener(this);
	cb13.addActionListener(this);
	cb14.addActionListener(this);
	cpy=new JButton("Fix Point");cpy.setBackground(Color.blue);cpy.setForeground(Color.cyan);
	cpy.setBounds(343,325,82,15);
	cpy.setToolTipText("Copy to Fixed Points");
	cpy.addActionListener(this);
	p1.add(cpy);
	bk=new JButton("Desktop");bk.setBackground(Color.red);bk.setForeground(Color.green);
	bk.setBounds(395,412,81,15);
	bk.setToolTipText("Click to go to Desktop");
	bk.addActionListener(this);
p1.add(bk);



	}
else if(pt==1)
{gr=0;
p2.setVisible(true);
cb1.setVisible(true);
cb2.setVisible(true);
cb3.setVisible(true);
cb4.setVisible(true);
cb5.setVisible(true);
cb6.setVisible(true);
cb7.setVisible(true);
cb8.setVisible(true);
cb9.setVisible(true);
cb10.setVisible(true);
cb11.setVisible(true);
cb12.setVisible(true);
cb13.setVisible(true);
cb14.setVisible(true);
m1.setVisible(true);
m2.setVisible(true);
m3.setVisible(true);
m4.setVisible(true);
m5.setVisible(true);
m6.setVisible(true);
m7.setVisible(true);
m8.setVisible(true);
m9.setVisible(true);
m10.setVisible(true);
m11.setVisible(true);
tmp1.setVisible(true);
tmp2.setVisible(true);
cpy.setVisible(true);
bk.setVisible(true);
}
}
void log3()
{if(fm==0)
{fm=1;
op1=new JButton("Create");op1.setBackground(Color.white);op1.setForeground(Color.black);
op2=new JButton("Open");op2.setBackground(Color.white);op2.setForeground(Color.black);
op3=new JButton("Create");op3.setBackground(Color.white);op3.setForeground(Color.black);
op4=new JButton("Rename");op4.setBackground(Color.white);op4.setForeground(Color.black);
y1=new JLabel("System Status:");y1.setForeground(Color.red);
y2=new JTextArea(10,10);y2.setBackground(Color.white);y2.setForeground(Color.black);
y5=new JButton("Desktop");y5.setBackground(Color.red);y5.setForeground(Color.green);
sc=new JScrollPane(y2);

w1=new JLabel("FILE MANAGER:");w1.setForeground(Color.red);
w2=new JCheckBox("Create New File:");w2.setBackground(Color.cyan);w2.setForeground(Color.blue);
w3=new JLabel("File Name:");w3.setForeground(Color.cyan);
w4=new JTextField(10);w4.setBackground(Color.black);w4.setForeground(Color.red);
w5=new JCheckBox("Current Location");w5.setBackground(Color.blue);w5.setForeground(Color.cyan);
w6=new JCheckBox("Specify Location:");w6.setBackground(Color.blue);w6.setForeground(Color.cyan);
w7=new JTextField(10);w7.setBackground(Color.black);w7.setForeground(Color.red);
w8=new JCheckBox("Open a File:");w8.setBackground(Color.cyan);w8.setForeground(Color.blue);
w9=new JLabel("File Name:");w9.setForeground(Color.cyan);
w10=new JTextField(10);w10.setBackground(Color.black);w10.setForeground(Color.red);
w11=new JCheckBox("Current Location");w11.setBackground(Color.blue);w11.setForeground(Color.cyan);
w12=new JCheckBox("Specify Location:");w12.setBackground(Color.blue);w12.setForeground(Color.cyan);
w13=new JTextField(10);w13.setBackground(Color.black);w13.setForeground(Color.red);
w14=new JCheckBox("Add Content to File:");w14.setBackground(Color.blue);w14.setForeground(Color.cyan);
w15=new JCheckBox("Append Data");w15.setBackground(Color.blue);w15.setForeground(Color.cyan);
w16=new JCheckBox("Truncate Data");w16.setBackground(Color.blue);w16.setForeground(Color.cyan);
w17=new JCheckBox("Search:");w17.setBackground(Color.blue);w17.setForeground(Color.cyan);
w18=new JLabel("Word:");w18.setForeground(Color.cyan);
w19=new JTextField(10);w19.setBackground(Color.black);w19.setForeground(Color.red);
w20=new JLabel("Result:");w20.setForeground(Color.cyan);
w21=new JTextField(10);w21.setBackground(Color.black);w21.setForeground(Color.red);
w22=new JCheckBox("No. of Lines:");w22.setBackground(Color.blue);w22.setForeground(Color.cyan);
w23=new JTextField(10);w23.setBackground(Color.black);w23.setForeground(Color.red);
tt1=new JLabel("FOLDER MANAGER:");tt1.setForeground(Color.red);
t2=new JCheckBox("Create New Folder:");t2.setBackground(Color.cyan);t2.setForeground(Color.blue);
t3=new JLabel("FOLDER Name:");t3.setForeground(Color.cyan);
t4=new JTextField(10);t4.setBackground(Color.black);t4.setForeground(Color.red);
t5=new JCheckBox("Current Location");t5.setBackground(Color.blue);t5.setForeground(Color.cyan);
t6=new JCheckBox("Specify Location");t6.setBackground(Color.blue);t6.setForeground(Color.cyan);
t7=new JTextField(10);t7.setBackground(Color.black);t7.setForeground(Color.red);
t8=new JCheckBox("Rename Folder:");t8.setBackground(Color.cyan);t8.setForeground(Color.blue);
t9=new JLabel("FOLDER Name:");t9.setForeground(Color.cyan);
t10=new JTextField(10);t10.setBackground(Color.black);t10.setForeground(Color.red);
t11=new JCheckBox("Current Location");t11.setBackground(Color.blue);t11.setForeground(Color.cyan);
t12=new JCheckBox("Specify Location");t12.setBackground(Color.blue);t12.setForeground(Color.cyan);
t13=new JTextField(10);t13.setBackground(Color.black);t13.setForeground(Color.red);
t14=new JLabel("New FOLDER Name:");t14.setForeground(Color.cyan);
t15=new JTextField(10);t15.setBackground(Color.black);t15.setForeground(Color.red);


w1.setBounds(15,100,90,20);w1.setToolTipText("File Management Options");
w2.setBounds(15,120,120,20);w2.setToolTipText("Create A New File");
w3.setBounds(15,140,60,20);w3.setToolTipText("Enter File Name");
w4.setBounds(73,143,90,20);
w5.setBounds(15,165,120,20);w5.setToolTipText("Create in current Loaction");
w6.setBounds(15,188,125,20);w6.setToolTipText("Enter Other Location");
w7.setBounds(140,188,90,20);
w8.setBounds(15,210,100,20);w8.setToolTipText("Open a File");
w9.setBounds(15,230,60,20);w9.setToolTipText("Enter File Name");
w10.setBounds(73,233,90,20);
w11.setBounds(15,253,120,20);w11.setToolTipText("Create in current Loaction");
w12.setBounds(15,276,125,20);w12.setToolTipText("Enter Other Location");
w13.setBounds(140,276,90,20);
w14.setBounds(15,299,140,20);w14.setToolTipText("Add Content to File");
w15.setBounds(15,322,100,20);w15.setToolTipText("Preserve Previous Data");
w16.setBounds(120,322,110,20);w16.setToolTipText("Delete Previous Data");
w17.setBounds(15,345,70,20);w17.setToolTipText("Search Word");
w18.setBounds(100,345,40,20);w18.setToolTipText("Enter word to be searched");
w19.setBounds(140,345,90,20);
w20.setBounds(100,365,40,20);w20.setToolTipText("Shows number of words matched");
w21.setBounds(140,365,90,20);
w22.setBounds(15,388,100,20);w22.setToolTipText("No. of Lines in File");
w23.setBounds(115,388,50,20);
tt1.setBounds(260,100,110,20);tt1.setToolTipText("FOLDER Management Options");
t2.setBounds(260,120,135,20);t2.setToolTipText("Create A New FOLDER");
t3.setBounds(260,140,90,20);t3.setToolTipText("Enter FOLDER Name");
t4.setBounds(348,143,90,20);
t5.setBounds(260,165,120,20);t5.setToolTipText("Create in current Loaction");
t6.setBounds(260,188,125,20);t6.setToolTipText("Enter Other Location");
t7.setBounds(385,188,90,20);
t8.setBounds(260,211,120,20);t8.setToolTipText("Rename FOLDER");
t9.setBounds(260,234,90,20);t9.setToolTipText("Enter FOLDER Name");
t10.setBounds(348,237,90,20);
t11.setBounds(260,259,120,20);t11.setToolTipText("Create in current Loaction");
t12.setBounds(260,282,125,20);t12.setToolTipText("Enter Other Location");
t13.setBounds(385,282,90,20);
t14.setBounds(260,305,115,20);t14.setToolTipText("Enter Name of New FOLDER");
t15.setBounds(375,305,90,20);
y5.setBounds(385,408,90,20);y5.setToolTipText("Click to go to Desktop");
sc.setBounds(260,330,215,75);
y2.setText("//Write File Content in this Area");
op1.setBounds(140,120,72,20);op1.setToolTipText("Click to Create the File");
op2.setBounds(120,210,65,20);op2.setToolTipText("Click to Open the File");
op3.setBounds(400,120,72,20);op3.setToolTipText("Click to Create the FOLDER");
op4.setBounds(385,211,85,20);op4.setToolTipText("Click to Rename the FOLDER");

ButtonGroup bg1=new ButtonGroup();
bg1.add(w2);
bg1.add(w8);
ButtonGroup bg2=new ButtonGroup();
bg2.add(w5);
bg2.add(w6);
ButtonGroup bg3=new ButtonGroup();
bg3.add(w11);
bg3.add(w12);
ButtonGroup bg4=new ButtonGroup();
bg4.add(w15);
bg4.add(w16);
ButtonGroup bg5=new ButtonGroup();
bg5.add(t2);
bg5.add(t8);
ButtonGroup bg6=new ButtonGroup();
bg6.add(t5);
bg6.add(t6);
ButtonGroup bg7=new ButtonGroup();
bg7.add(t11);
bg7.add(t12);

p1.add(w1);
p1.add(w2);
p1.add(w3);
p1.add(w4);
p1.add(w5);
p1.add(w6);
p1.add(w7);
p1.add(w8);
p1.add(w9);
p1.add(w10);
p1.add(w11);
p1.add(w12);
p1.add(w13);
p1.add(w14);
p1.add(w15);
p1.add(w16);
p1.add(w17);
p1.add(w18);
p1.add(w19);
p1.add(w20);
p1.add(w21);
p1.add(w22);
p1.add(w23);
p1.add(tt1);
p1.add(t2);
p1.add(t3);
p1.add(t4);
p1.add(t5);
p1.add(t6);
p1.add(t7);
p1.add(t8);
p1.add(t9);
p1.add(t10);
p1.add(t11);
p1.add(t12);
p1.add(t13);
p1.add(t14);
p1.add(t15);
p1.add(y5);
p1.add(sc);
p1.add(op1);
p1.add(op2);
p1.add(op3);
p1.add(op4);
op1.setVisible(false);
op2.setVisible(false);
op3.setVisible(false);
op4.setVisible(false);
w3.setVisible(false);
w4.setVisible(false);
w5.setVisible(false);
w6.setVisible(false);
w7.setVisible(false);
w9.setVisible(false);
w10.setVisible(false);
w11.setVisible(false);
w12.setVisible(false);
w13.setVisible(false);
w14.setVisible(false);
w15.setVisible(false);
w16.setVisible(false);
w17.setVisible(false);
w18.setVisible(false);
w19.setVisible(false);
w20.setVisible(false);
w21.setVisible(false);
w22.setVisible(false);
w23.setVisible(false);
t3.setVisible(false);
t4.setVisible(false);
t5.setVisible(false);
t6.setVisible(false);
t7.setVisible(false);
t9.setVisible(false);
t10.setVisible(false);
t11.setVisible(false);
t12.setVisible(false);
t13.setVisible(false);
t14.setVisible(false);
t15.setVisible(false);
y2.setVisible(false);
sc.setVisible(false);

w2.addActionListener(this);
w5.addActionListener(this);
w6.addActionListener(this);
w8.addActionListener(this);
w11.addActionListener(this);
w12.addActionListener(this);
w14.addActionListener(this);
w15.addActionListener(this);
w16.addActionListener(this);
w17.addActionListener(this);
w22.addActionListener(this);
t2.addActionListener(this);
t5.addActionListener(this);
t6.addActionListener(this);
t8.addActionListener(this);
t11.addActionListener(this);
t12.addActionListener(this);
y5.addActionListener(this);
op1.addActionListener(this);
op2.addActionListener(this);
op3.addActionListener(this);
op4.addActionListener(this);
}
else if(fm==1)
{/*op1.setVisible(true);
op2.setVisible(true);
op3.setVisible(true);
op4.setVisible(true);*/
w1.setVisible(true);
w2.setVisible(true);
w8.setVisible(true);
tt1.setVisible(true);
t2.setVisible(true);
t8.setVisible(true);
y5.setVisible(true);
}
}



public void actionPerformed(ActionEvent e)
{if(e.getSource()==b1)//Login Button
{String l=t1.getText();
if(l.equals("nova")||l.equals("N0VA")||l.equals("n.o.v.a")||l.equals("N.O.V.A"))
{
	JOptionPane.showMessageDialog(f1,"Welcome to NOVA.   :)\nVersion 1.0");key=1;this.log();
f1.setVisible(true);f1.setSize(500,525);}
else
{	i=i-1;
	if(i==0)
	{JOptionPane.showMessageDialog(f1,"LOGIN_FAILED.\n Restart the Program.");
	f1.setVisible(false);
	}
	else if(i==1)
	{JOptionPane.showMessageDialog(f1,"THIS IS YOUR LAST CHANCE!");
	}
	else
	{JOptionPane.showMessageDialog(f1,"WRONG PASSWORD. ENTER AGAIN.\n"+i+" Chances left!");
	}
t1.setText("");
}

}
else if(e.getSource()==b2)//Paint Button
{l3.setVisible(false);
b2.setVisible(false);
l4.setVisible(false);
b3.setVisible(false);
l5.setVisible(false);
b4.setVisible(false);

f1.setVisible(true);f1.setSize(500,526);
f1.setVisible(true);f1.setSize(500,525);
this.log2();}
else if(e.getSource()==b3)//Command Prompt Button
{f1.setVisible(false);
dos temp=new dos();
temp.oxy();
}
else if(e.getSource()==cb1){base="blue";p2.setBackground(Color.blue);}
else if(e.getSource()==cb2){base="green";p2.setBackground(Color.green);}
else if(e.getSource()==cb3){base="red";p2.setBackground(Color.red);}
else if(e.getSource()==cb4){base="black";p2.setBackground(Color.black);}
else if(e.getSource()==cb5){base="white";p2.setBackground(Color.white);}
else if(e.getSource()==cb6){front="blue";}
else if(e.getSource()==cb7){front="green";}
else if(e.getSource()==cb8){front="red";}
else if(e.getSource()==cb9){front="black";}
else if(e.getSource()==cb10){front="white";}
else if(e.getSource()==cb11){painttype=1;}
else if(e.getSource()==cb12){painttype=2;}
else if(e.getSource()==cb13){painttype=3;}
else if(e.getSource()==cb14){painttype=0;}
else if(e.getSource()==cpy)
{m8.setText(m3.getText());
m10.setText(m5.getText());
}
else if(e.getSource()==bk)
{p2.setVisible(false);
l3.setVisible(true);
b2.setVisible(true);
cb1.setVisible(false);
cb2.setVisible(false);
cb3.setVisible(false);
cb4.setVisible(false);
cb5.setVisible(false);
cb6.setVisible(false);
cb7.setVisible(false);
cb8.setVisible(false);
cb9.setVisible(false);
cb10.setVisible(false);
cb11.setVisible(false);
cb12.setVisible(false);
cb13.setVisible(false);
cb14.setVisible(false);
m1.setVisible(false);
m2.setVisible(false);
m3.setVisible(false);
m4.setVisible(false);
m5.setVisible(false);
m6.setVisible(false);
m7.setVisible(false);
m8.setVisible(false);
m9.setVisible(false);
m10.setVisible(false);
m11.setVisible(false);
tmp1.setVisible(false);
tmp2.setVisible(false);
cpy.setVisible(false);
l4.setVisible(true);
b3.setVisible(true);
bk.setVisible(false);
l5.setVisible(true);
b4.setVisible(true);
gr=1;
this.log();f1.setVisible(true);f1.setSize(500,525);

}
else if(e.getSource()==b4) ///File Manager Button
{l3.setVisible(false);
b2.setVisible(false);
l4.setVisible(false);
b3.setVisible(false);
l5.setVisible(false);
b4.setVisible(false);

f1.setVisible(true);f1.setSize(500,526);
this.log3();
}
else if(e.getSource()==w2)
{w3.setVisible(true);
w4.setVisible(true);
w5.setVisible(true);
w6.setVisible(true);
w7.setVisible(true);
w9.setVisible(false);
w10.setVisible(false);
w11.setVisible(false);
w12.setVisible(false);
w13.setVisible(false);
w14.setVisible(false);
w15.setVisible(false);
w16.setVisible(false);
w17.setVisible(false);
w18.setVisible(false);
w19.setVisible(false);
w20.setVisible(false);
w21.setVisible(false);
w22.setVisible(false);
w23.setVisible(false);
y2.setVisible(true);
sc.setVisible(true);
op1.setVisible(true);
op2.setVisible(false);

}
else if(e.getSource()==w5){sl1="";}
else if(e.getSource()==w6){sl1="copy";}
else if(e.getSource()==w8)
{w3.setVisible(false);
w4.setVisible(false);
w5.setVisible(false);
w6.setVisible(false);
w7.setVisible(false);
w9.setVisible(true);
w10.setVisible(true);
w11.setVisible(true);
w12.setVisible(true);
w13.setVisible(true);
w14.setVisible(true);
w15.setVisible(true);
w16.setVisible(true);
w17.setVisible(true);
w18.setVisible(true);
w19.setVisible(true);
w20.setVisible(true);
w21.setVisible(true);
w22.setVisible(true);
w23.setVisible(true);
y2.setVisible(true);
sc.setVisible(true);
op1.setVisible(false);
op2.setVisible(true);

}
else if(e.getSource()==w11){sl1="";}
else if(e.getSource()==w12){sl1="copy";}
else if(e.getSource()==w14){if(opentypem==0){opentypem=-1;}else if(opentypem==-1){opentypem=0;}}
else if(e.getSource()==w15){opentype=1;}
else if(e.getSource()==w16){opentype=2;}
else if(e.getSource()==w17){if(word.equals("")){word="copy";}else if(word.equals("copy")){word="";w19.setText("");w21.setText("");}}
else if(e.getSource()==w22){if(nl==0){nl=1;}else if(nl==1){nl=0;w23.setText("");}}
else if(e.getSource()==t2)
{t3.setVisible(true);
t4.setVisible(true);
t5.setVisible(true);
t6.setVisible(true);
t7.setVisible(true);
t9.setVisible(false);
t10.setVisible(false);
t11.setVisible(false);
t12.setVisible(false);
t13.setVisible(false);
t14.setVisible(false);
t15.setVisible(false);
op3.setVisible(true);
op4.setVisible(false);

}
else if(e.getSource()==t5){sl2="";}
else if(e.getSource()==t6){sl2="copy";}
else if(e.getSource()==t8)
{t3.setVisible(false);
t4.setVisible(false);
t5.setVisible(false);
t6.setVisible(false);
t7.setVisible(false);
t9.setVisible(true);
t10.setVisible(true);
t11.setVisible(true);
t12.setVisible(true);
t13.setVisible(true);
t14.setVisible(true);
t15.setVisible(true);
op3.setVisible(false);
op4.setVisible(true);
}
else if(e.getSource()==t11){sl2="";}
else if(e.getSource()==t12){sl2="copy";}

else if(e.getSource()==op1)//Create File
{try
{fn1=w4.getText();
if(sl1.equals("copy"))
{sl1=w7.getText();
fn1=""+sl1+fn1+"\\";
sl1="";
}
FileWriter fw=new FileWriter(fn1);
BufferedWriter bw=new BufferedWriter(fw);
fn1=y2.getText();
bw.write(fn1,0,fn1.length());
bw.flush();
}
catch(IOException e1){}
}
else if(e.getSource()==op2)//Open File
{
try
{
fn1=w10.getText();
if(sl1.equals("copy"))
{sl1=w13.getText();
fn1=""+sl1+fn1+"\\";
sl1="copy";}
if(opentype==1&&opentypem==-1)
{
FileWriter fw=new FileWriter(fn1,true);
BufferedWriter bw=new BufferedWriter(fw);
String s=y2.getText();
bw.write(s,0,s.length());
bw.flush();
}
else if(opentype==2&&opentypem==-1)
{FileWriter fw=new FileWriter(fn1);
BufferedWriter bw=new BufferedWriter(fw);
String s=y2.getText();
bw.write(s,0,s.length());
bw.flush();
}





fn1=w10.getText();
if(sl1.equals("copy"))
{sl1=w13.getText();
fn1=""+sl1+fn1+"\\";
sl1="";
}
FileReader ir=new FileReader(fn1);
fn1="";

int y,k=0,k1=0;
String yu=w19.getText();
for(y=1;y<=80;y++){System.out.print("=");}
System.out.println("File Opened:"+w10.getText());
for(y=1;y<=80;y++){System.out.print("=");}
BufferedReader br=new BufferedReader(ir);
while((fn1=br.readLine())!=null)
{System.out.println(fn1);k++;
String[] sentence = fn1.split(" ");
for(String word: sentence)
{if(word.equals(yu))
 k1++;}}
for(y=1;y<=80;y++){System.out.print("=");}
System.out.println("End of File Reached");
for(y=1;y<=80;y++){System.out.print("=");}
if(nl==1)
{w23.setText(""+k);}
if(word.equals("copy"))
{w21.setText(""+k1);}


}
catch(IOException e2){}
}
else if(e.getSource()==op3)//Create FOLDER
{fn2=t4.getText();
if(sl2.equals("copy"))
{sl2=t7.getText();
fn2=""+sl2+fn1+"\\";
sl2="";
}
File f2=new File(fn2);
f2.mkdir();
}
else if(e.getSource()==op4)//Rename FOLDER
{fn2=t10.getText();
if(sl2.equals("copy"))
{sl2=t13.getText();
fn2=""+sl2+fn1+"\\";
sl2="";
}
File f2=new File(fn2);
f2.mkdir();
File f3=new File(t15.getText());
f2.renameTo(f3);

}

else if(e.getSource()==y5)
{op1.setVisible(false);
op2.setVisible(false);
op3.setVisible(false);
op4.setVisible(false);
w1.setVisible(false);
w2.setVisible(false);
w3.setVisible(false);
w4.setVisible(false);
w5.setVisible(false);
w6.setVisible(false);
w7.setVisible(false);
w8.setVisible(false);
w9.setVisible(false);
w10.setVisible(false);
w11.setVisible(false);
w12.setVisible(false);
w13.setVisible(false);
w14.setVisible(false);
w15.setVisible(false);
w16.setVisible(false);
w17.setVisible(false);
w18.setVisible(false);
w19.setVisible(false);
w20.setVisible(false);
w21.setVisible(false);
w22.setVisible(false);
w23.setVisible(false);
tt1.setVisible(false);
t2.setVisible(false);
t3.setVisible(false);
t4.setVisible(false);
t5.setVisible(false);
t6.setVisible(false);
t7.setVisible(false);
t8.setVisible(false);
t9.setVisible(false);
t10.setVisible(false);
t11.setVisible(false);
t12.setVisible(false);
t13.setVisible(false);
t14.setVisible(false);
t15.setVisible(false);
y2.setVisible(false);
sc.setVisible(false);
y5.setVisible(false);
l3.setVisible(true);
b2.setVisible(true);
l4.setVisible(true);
b3.setVisible(true);
l5.setVisible(true);
b4.setVisible(true);
}
}
public void mousePressed(MouseEvent e1){}
public void mouseReleased(MouseEvent e2){temp=0;}
public void mouseClicked(MouseEvent e3){}
public void mouseExited(MouseEvent e4){}
public void mouseEntered(MouseEvent e5){}

public void mouseDragged(MouseEvent e1)
{if(gr==0)
{int x=e1.getX();
int y=e1.getY();
if(x<15){x=15;}
if(x>469){x=469;}
if(y<105){y=105;}
if(y>304){y=304;}
Graphics g=p1.getGraphics();
if(front.equals(""))
{g.setColor(Color.black);}
else if(front.equals("blue"))
{g.setColor(Color.blue);}
else if(front.equals("green"))
{g.setColor(Color.green);}
else if(front.equals("red"))
{g.setColor(Color.red);}
else if(front.equals("black"))
{g.setColor(Color.black);}
else if(front.equals("white"))
{g.setColor(Color.white);}
if(painttype==0)
{if(temp==0)
{g.drawLine(x,y,x,y);temp=1;}
else{g.drawLine(temp1,temp2,x,y);}}
else if(painttype==1)
{int ws=y+100;
if(ws<105){ws=105;}
if(ws>304){ws=304;}
if(temp==0)
{g.drawLine(x,ws,x,y);temp=1;}
else{g.drawLine(temp1,temp2,x,ws);}  //3D LIne
}
else if(painttype==2)
{g.drawLine(x,y,x,y);} //Spray Painting
else if(painttype==3)
{try
{
if(m8.getText().equals("")&&m10.getText().equals("")){}
else
{fx=Integer.parseInt(m8.getText());
fy=Integer.parseInt(m10.getText());
if(fx<15){fx=15;}
if(fx>469){fx=469;}
if(fy<105){fy=105;}
if(fy>304){fy=304;}}}
catch(Exception e){JOptionPane.showMessageDialog(f1,"PLEASE ENTER NUMBER IN\nTHE FIXED POINT\nCO-ORDINATE BOX.");}
g.drawLine(fx,fy,x,y);}	//Source Point
temp1=x;
temp2=y;
m3.setText(""+x);
m5.setText(""+y);}
}
public void mouseMoved(MouseEvent e2){}

public static void tray()
{systray obj1=new systray();
obj1.log();
}
}
////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////
class nova///Head Quatars of Programming Code
{public static void main(String ss[])
{startup obj1=new startup();
obj1.start();
systray obj2=new systray();
obj2.tray();
}
}
////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////

class delay
{void del(int a)
{try{Thread.sleep(a);}
catch(Exception e){}}}

class startup2
{void stp()
{delay obj1=new delay();
int i,j;
System.out.println("\n\n\n");
for(j=1;j<=3;j++)
{
if(j==2)
{System.out.print("\t\t\t\t|<  DOS  >|\n");}
else
{for(i=1;i<=80;i++)
{System.out.print("=");obj1.del(5);}
System.out.print("\n");}}
for(i=1;i<=3;i++)
{System.out.print("\t\t\t\t  L");obj1.del(100);
System.out.print("O");obj1.del(100);
System.out.print("A");obj1.del(100);
System.out.print("D");obj1.del(100);
System.out.print("I");obj1.del(100);
System.out.print("N");obj1.del(100);
System.out.print("G");obj1.del(100);
System.out.print(".");obj1.del(100);
System.out.print(".");obj1.del(100);
System.out.print(".");obj1.del(100);
System.out.print("\r\t\t\t\t            \r");
}
}}

class verfication
{void verf()
{
try{
InputStreamReader i=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(i);
System.out.print("ENTER PASSWORD: ");
String pass=br.readLine();
if(pass.equals("dos")||pass.equals("DOS"))
{System.out.print("\r                       \r");
System.out.print("\n>||WELCOME USER.\n");
}
else
{System.out.println("\nLogin ERROR!\n[REASON]: Password Incorrect");
shutdown obj1=new shutdown();obj1.sd();}
}
catch(Exception e){}
}
}

class process
{
void proc()
{System.out.print("|Enter \'help\' for commands.\n");
for(;;)
{try{

InputStreamReader i=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(i);
System.out.print("|");
String a=br.readLine();
if(a.equals("exit")||a.equals("EXIT"))
{shutdown obj1=new shutdown();obj1.sd();}
else if(a.equals("help")||a.equals("HELP"))
{System.out.print("|\n|[AVAILABLE COMMANDS]:\n|1) exit/EXIT\n|2) help/HELP\n|3) whoami/WHOAMI\n|4) whoareyou/WHOAREYOU\n|5) about/ABOUT\n|6) add/addition/ADD/ADDITION\n|7) sub/substraction/SUB/SUBSTRACTION\n|8) multiply/multiplication/MULTIPLY/MULTIPLICATION\n|9) divide/DIVIDE\n|10) factorial/FACTORIAL\n|11) remainder/REMAINDER\n|\n");}
else if(a.equals("whoami")||a.equals("WHOAMI"))
{System.out.print("|Current User: Anonymous User\n|Admin: ROBIN DAVIS\n|\n");}
else if(a.equals("whoareyou")||a.equals("WHOAREYOU"))
{System.out.print("|Computer :)\n|\n");}
else if(a.equals("about")||a.equals("ABOUT"))
{System.out.print("|________________________________\n|Creator: ROBIN DAVIS\n|Email ID: robin.dvs007@gmail.com\n|________________________________\n|\n");}
else if(a.equals("add")||a.equals("addition")||a.equals("ADD")||a.equals("ADDITION"))
{System.out.print("|\n|[OPERATION SELECTED: Addition]\n|Enter 1st Number: ");
float a1=Float.parseFloat(br.readLine());
System.out.print("|Enter 2nd Number: ");
float a2=Float.parseFloat(br.readLine());
a2=a1+a2;
System.out.print("|\n| ANSWER = "+a2+"\n|\n");}

else if(a.equals("sub")||a.equals("substraction")||a.equals("SUB")||a.equals("SUBSTRACTION"))
{System.out.print("|\n|[OPERATION SELECTED: Substraction]\n|Enter 1st Number: ");
float a1=Float.parseFloat(br.readLine());
System.out.print("|Enter 2nd Number: ");
float a2=Float.parseFloat(br.readLine());
a2=a1-a2;
System.out.print("|\n| ANSWER = "+a2+"\n|\n");}

else if(a.equals("multiply")||a.equals("multiplication")||a.equals("MULTIPLY")||a.equals("MULTIPLICATION"))
{System.out.print("|\n|[OPERATION SELECTED: Multiplication]\n|Enter 1st Number: ");
float a1=Float.parseFloat(br.readLine());
System.out.print("|Enter 2nd Number: ");
float a2=Float.parseFloat(br.readLine());
a2=a1*a2;
System.out.print("|\n| ANSWER = "+a2+"\n|\n");}

else if(a.equals("divide")||a.equals("DIVIDE"))
{System.out.print("|\n|[OPERATION SELECTED: Divide]\n|Enter 1st Number: ");
float a1=Float.parseFloat(br.readLine());
System.out.print("|Enter 2nd Number: ");
float a2=Float.parseFloat(br.readLine());
a2=a1/a2;
System.out.print("|\n| ANSWER = "+a2+"\n|\n");}

else if(a.equals("factorial")||a.equals("FACTORIAL"))
{System.out.print("|\n|[OPERATION SELECTED: Factorial]\n|Enter Number: ");
float a2=Float.parseFloat(br.readLine());
float z,q=1;
for(z=a2;z>=1;z--)
{q=z*q;}
System.out.print("|\n| ANSWER = "+q+"\n|\n");
}


else if(a.equals("remainder")||a.equals("REMAINDER"))
{System.out.print("|\n|[OPERATION SELECTED: Divide]\n|Enter 1st Number: ");
float a1=Float.parseFloat(br.readLine());
System.out.print("|Enter 2nd Number: ");
float a2=Float.parseFloat(br.readLine());
a2=a1%a2;
System.out.print("|\n| ANSWER = "+a2+"\n|\n");
}

}
catch(Exception e){}
}}
}


class shutdown
{void sd()
{
delay obj1=new delay();
int i,j;
System.out.println("\n\n\n");
for(j=1;j<=3;j++)
{
if(j==2)
{System.out.print("\n\t\t\t\t|<SHUTTING DOWN>|\n");}
else
{for(i=1;i<=80;i++)
{System.out.print("=");obj1.del(5);}}}
System.out.println("\n\n\n");
System.exit(0);

}}




class dos
{public static void oxy()
{startup2 obj1=new startup2();
obj1.stp();
verfication obj2=new verfication();
obj2.verf();
process obj3=new process();
obj3.proc();
}
}