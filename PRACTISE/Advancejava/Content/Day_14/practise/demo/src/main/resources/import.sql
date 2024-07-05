INSERT INTO users (email,name,password,phone,created_on) VALUES('nilesh@sunbeaminfo.com','Nilesh Ghule','nilesh','9527331338','2022-12-02 20:14:37');
INSERT INTO users (email,name,password,phone,created_on) VALUES('nitin@sunbeaminfo.com','Nitin Kudale','nitin','9881208115','2022-12-02 20:45:47');
INSERT INTO users (email,name,password,phone,created_on) VALUES('vishal@sunbeaminfo.com','Vishal Salunkhe','vishal','9822012345','2022-12-02 20:50:54');


INSERT INTO categories (title,description) VALUES('Nature','Nature related blogs');
INSERT INTO categories (title,description) VALUES('Movie','Movie related blogs');
INSERT INTO categories (title,description) VALUES('Music','Music related blogs');

INSERT INTO categories (title,description) VALUES('Technology','Technology related blogs');

INSERT INTO categories (title,description) VALUES('Java','Java programming language blogs');


INSERT INTO blogs (created_on,contents,title,category_id,user_id) VALUES('2022-12-02 21:14:37','Java is OOP language. It is platform-independent. Java programs are compiled into bytecode and then executed on JVM.','Java Introduction',5,1);
INSERT INTO blogs (created_on,contents,title,category_id,user_id) VALUES('2022-12-02 21:22:54','Computers are evolving day by day. The tech horizon is expanding. Now it has all flavours including application development, mobile programming, embedded systems, artificial intelligence, cyber security and many more.','Computer Tech',4,2),
INSERT INTO blogs (created_on,contents,title,category_id,user_id) VALUES('2022-12-02 22:49:35','Technology is the application of knowledge to reach practical goals in a specifiable and reproducible way. The word technology may also mean the product of such an endeavour. The use of technology is widely prevalent in medicine, science, industry, communication, transportation, and daily life. Technologies include physical objects like utensils or machines and intangible tools such as software.','Technology Wiki',4,2);
INSERT INTO blogs (created_on,contents,title,category_id,user_id) VALUES('2022-12-02 22:50:30','Information technology (IT) is the use of computers to create, process, store, retrieve, and exchange all kinds of data and information. IT forms part of information and communications technology (ICT). An information technology system (IT system) is generally an information system, a communications system, or, more specifically speaking, a computer system � including all hardware, software, and peripheral equipment � operated by a limited group of IT users.','Information Technology',4,2);
INSERT INTO blogs (created_on,contents,title,category_id,user_id) VALUES('2022-12-02 22:52:15','A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O., but his tragic past may doom the project and his team to disaster.','Inception',2,1);
INSERT INTO blogs (created_on,contents,title,category_id,user_id) VALUES('2022-12-02 23:04:35','A paraplegic Marine dispatched to the moon Pandora on a unique mission becomes torn between following his orders and protecting the world he feels is his home. Directed by: James Cameron and team.','Avatar',2,1);
INSERT INTO blogs (created_on,contents,title,category_id,user_id) VALUES('2022-12-02 23:07:59','Lambda Expressions were added in Java 8. A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.','Lambda Expression',5,1);
