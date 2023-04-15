package lk.ijse.d24hostelsystem.bo.custom.impl;

import lk.ijse.d24hostelsystem.bo.custom.StudentBO;
import lk.ijse.d24hostelsystem.dao.DAOFactory;
import lk.ijse.d24hostelsystem.dao.custom.StudentDAO;
import lk.ijse.d24hostelsystem.dto.StudentDTO;
import lk.ijse.d24hostelsystem.entity.Student;
import lk.ijse.d24hostelsystem.util.SessionFactoryConfig;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class StudentBOImpl implements StudentBO {
    private Session session;
    StudentDAO studentDAO = (StudentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.Student);
    @Override
    public List<StudentDTO> loadAll() throws Exception {
        return null;
    }

    @Override
    public boolean saveStudent(StudentDTO studentDTO) throws Exception {
        session= SessionFactoryConfig.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try{
            studentDAO.setSession(session);
            String id = studentDAO.save(
                    new Student(
                            studentDTO.getStudentId(),
                            studentDTO.getStudentName(),
                            studentDTO.getNic(),
                            studentDTO.getHomeTown(),
                            studentDTO.getGender(),
                            studentDTO.getPhoneNumber(),
                            studentDTO.getUniversity()
                    ));
            transaction.commit();
            session.close();
            if (id!=null){
                return true;
            }
        }catch (Exception e){
            transaction.rollback();
        }

        return false;
    }

    @Override
    public boolean updateStudent(StudentDTO studentDTO) throws Exception {
        session=SessionFactoryConfig.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        try {
            studentDAO.setSession(session);
            studentDAO.update(
                    new Student(
                            studentDTO.getStudentId(),
                            studentDTO.getStudentName(),
                            studentDTO.getNic(),
                            studentDTO.getHomeTown(),
                            studentDTO.getGender(),
                            studentDTO.getPhoneNumber(),
                            studentDTO.getUniversity()
                    ));
            transaction.commit();
            session.close();
            return true;
        }catch (Exception e){
            transaction.rollback();
        }

        return false;
    }

    @Override
    public boolean deleteStudent(StudentDTO studentDTO) throws Exception {
        session=SessionFactoryConfig.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        try {
            studentDAO.setSession(session);
            studentDAO.delete(
                    new Student(
                            studentDTO.getStudentId(),
                            studentDTO.getStudentName(),
                            studentDTO.getNic(),
                            studentDTO.getHomeTown(),
                            studentDTO.getGender(),
                            studentDTO.getPhoneNumber(),
                            studentDTO.getUniversity()
                    ));
            transaction.commit();
            session.close();
            return true;
        }catch (Exception e){
            transaction.rollback();
        }

        return false;
    }

    @Override
    public String generateNextStudentID() throws Exception {
        session= SessionFactoryConfig.getInstance().getSession();
        studentDAO.setSession(session);
        return studentDAO.generateID();
    }
}
