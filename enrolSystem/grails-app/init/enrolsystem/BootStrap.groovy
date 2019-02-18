package com.enrol

class BootStrap {

   def init = { servletContext -> 

def LHirche = new
Lecturer(
fullName:'Laurie Hirche',
post:'lecturer',
subject:'Database Admins',
lecturerEmail:'lhir123@hotmail.com',
office:'Arundel',
bio:'''Lorem impsum,error tantas ne Te duo putant detracto.''').save()

def LCinderey = new
Lecturer(
fullName:'Lynne Cinderey',
post:'lecturer',
subject:'System Informations',
lecturerEmail:'lcin123@hotmail.com',
office:'Owen',
bio:'''Lorem impsum,error tantas ne Te duo putant detracto.''').save()

def MTonderai = new
Lecturer(
fullName:'M Tonderai',
post:'lecturer',
subject:'System Architectures',
lecturerEmail:'mton123@hotmail.com',
office:'Norfolk',
bio:'''Lorem impsum,error tantas ne Te duo putant detracto.''').save()

def LCaprio = new
Lecturer(
fullName:'Leonardo Di Caprio',
post:'Senior lecturer',
subject:'Databases',
lecturerEmail:'leo123@hotmail.com',
office:'Cantor',
bio:'''Lorem impsum,error tantas ne Te duo putant detracto.''').save()



def Computing = new
Course(
department:'Computing',
courseCode:'CS123',
courseTitle:'BSc Hon Computing',
courseLeader:MTonderai,
startDate:new Date('09/09/2019'),
endDate:new Date('07/07/2023'),
numberOfStudents:55,
studyMode:'Fulltime',
tuitionFees:9000.60,
description:'''Lorem ipsum dolor sit amet, cam sale error tantas ne. Te duo putant detracto. In duo sonet urbanitas, ad vim vide tacimates.
''').save()

def Engineering = new
Course(
department:'Mechanical Engineering',
courseCode:'ME123',
courseTitle:'BSc Hon Mechanical Engineering',
courseLeader:LCaprio,
startDate:new Date('23/09/2020'),
endDate:new Date('06/07/2024'),
numberOfStudents:45,
studyMode:'Fulltime',
tuitionFees:90250,
description:'''Lorem ipsum dolor sit amet, cam sale error tantas ne. Te duo putant detracto. In duo sonet urbanitas, ad vim vide tacimates.
''').save()

def Law = new
Course(
department:'Law',
courseCode:'L123',
courseTitle:'BSc Hon Law',
courseLeader:LCinderey,
startDate:new Date('14/10/2030'),
endDate:new Date('06/07/2034'),
numberOfStudents:25,
studyMode:'Fulltime',
tuitionFees:90250,
description:'''Lorem ipsum dolor sit amet, cam sale error tantas ne. Te duo putant detracto. In duo sonet urbanitas, ad vim vide tacimates.
''').save()






def Zislam = new
Student(
studentName:'Zain Islam',
studentID:'b7012398',
dob:new Date('18/03/1999'),
isFundingAvailable:'Yes',
studentEmail:'zain456@hotmail.com',
studentUsername:'Zislam123',
studentPassword:'password',
course:Computing).save()

def SShabbir = new
Student(
studentName:'Shakir Shabbir',
studentID:'b7014085',
dob:new Date('18/05/1998'),
isFundingAvailable:'No',
studentEmail:'shakir456@hotmail.com',
studentUsername:'Sshabbir123',
studentPassword:'ss123456',
course:Law).save()

def CTurner = new
Student(
studentName:'Chris Turner',
studentID:'b7016798',
dob:new Date('03/04/1995'),
isFundingAvailable:'Yes',
studentEmail:'turner456@hotmail.com',
studentUsername:'Cturner123',
studentPassword:'password',
course:Computing).save()

def DHope = new
Student(
studentName:'Dave Hope',
studentID:'b2016298',
dob:new Date('03/12/1997'),
isFundingAvailable:'Yes',
studentEmail:'hope456@hotmail.com',
studentUsername:'Dhope123',
studentPassword:'password',
course:Engineering).save()









def SysArchs = new
Module(
module_title:'System Architectures',
module_code:'SA123',
credits:120,
lecturer:'M Tonderai',
description:'''Lorem impsum,error tantas ne Te duo putant detracto.''').save()

def Wadi = new
Module(
module_title:'Web Application Design and Implementation',
module_code:'WA123',
credits:120,
lecturer:'Lynne Cinderey',
description:'''Lorem impsum,error tantas ne Te duo putant detracto.''').save()

def Pr = new
Module(
module_title:'Project, Dissertation',
module_code:'PD123',
credits:80,
lecturer:'Leonardo Di Caprio',
description:'''Lorem impsum,error tantas ne Te duo putant detracto.''').save()


MTonderai.addToModules(SysArchs)

LCinderey.addToModules(Wadi)

LHirche.addToModules(Pr)



Computing.addToLecturers(LHirche)

Law.addToLecturers(LCaprio)

Engineering.addToLecturers(MTonderai)



MTonderai.addToCourses(Law)

LCaprio.addToCourses(Computing)



Computing.addToStudents(Zislam)

Computing.addToStudents(SShabbir)

Law.addToStudents(DHope)

Engineering.addToStudents(CTurner)


Pr.addToCourse(Computing)
Pr.addToCourse(Law)
Pr.addToCourse(Engineering)
Wadi.addToCourse(Computing)
SysArchs.addToCourse(Computing)

Pr.addToStudents(Zislam)
Wadi.addToStudents(Zislam)
SysArchs.addToStudents(SShabbir)
Pr.addToStudents(SShabbir)
SysArchs.addToStudents(CTurner)
Pr.addToStudents(CTurner)
Pr.addToStudents(DHope)
Wadi.addToStudents(DHope)






    }
    def destroy = {
    }
}
