package AssJava5.Repository;


import AssJava5.Model.Users;

public interface UserRepository extends Repository<Users> {
    Users findByUsername(String username);
}
