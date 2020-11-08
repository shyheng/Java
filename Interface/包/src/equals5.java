public class equals5 {
    public static void main(String[] args) {
        user u = new user("zph",new address("z","p","h"));
        user u2 = new user("zph",new address("z","p","h"));
        System.out.println(u.equals(u2));

        user u3 = new user("zha",new address("s","h","y"));
        System.out.println(u.equals(u3));
    }
}
//总结 equals得写彻底



class user{
    String name;
    address add;
//构造方法
    public user() {
    }

    public user(String name, address add) {
        this.name = name;
        this.add = add;
    }

//    重写equals
//当一个用户名和家庭住址都相同时，表示同一个用户
    public boolean equals(Object obj){
//        用户名和住址相同

        if (obj == null || !(obj instanceof user)) return false;

        if (this == obj ) return true;

        user s = (user)obj;
        return this.name.equals(s.name) && this.add.equals(s.add);

    }
}




class address{
    String city;
    String street;
    String zipcode;
//构造方法
    public address() {
    }

    public address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
//这里的equals判断的是address和address是否相等
//    所以得重写

    public boolean equals(Object obj){

        if (obj == null || !(obj instanceof  address)) return false;

        if (this == obj) return true;

        address s = (address)obj;
        return this.city.equals(s.city) && this.street.equals(street) &&this.zipcode.equals(zipcode);
      }
}