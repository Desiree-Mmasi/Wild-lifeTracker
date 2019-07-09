package models;

import org.sql2o.*;
public class DB {
//    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlifetracker", "moringa","1234");

//    String connectionString = "jdbc:postgresql://ec2-50-19-222-129.compute-1.amazonaws.com:5432/dfm5t3jbcsf2ps";
    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://ec2-50-19-222-129.compute-1.amazonaws.com:5432/dfm5t3jbcsf2ps", "bdnhsmptlxuapq", "7f574c5312eca1e02f6cc5d796c936a534f1cd44102b20c5e63485c64a49a668");
}

