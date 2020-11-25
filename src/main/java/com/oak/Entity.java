package com.oak;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Entity {



    public static void main(String[] args) {
        List<Heros> list = new ArrayList<>();
        String sql = "select * from heros";
        String res ="";
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            conn = JDBCUtils.getConnection();
            preparedStatement = conn.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Heros heros = new Heros();
                heros.setName(resultSet.getString("name"));
                heros.setGender(resultSet.getString("gender"));
                heros.setFaction(resultSet.getString("faction"));
                heros.setSkill_1(resultSet.getString("skill_1"));
                heros.setSkill_2(resultSet.getString("skill_2"));
                heros.setSkill_3(resultSet.getString("skill_3"));
                heros.setPassive(resultSet.getString("passive"));
                list.add(heros);
            }
            StringBuffer buffer = new StringBuffer();
            for (Heros heros1 : list) {
                buffer.append(heros1.toString());
            }
            res = buffer.toString();
            res = "<table border=\"1\" cellspacing=\"0\" width=\"500px\">" +
                    "<tr><td>英雄名</td><td>性别</td><td>派系</td><td>技能1</td><td>技能2</td><td>技能3</td><td>被动</td></tr>" +
                    res + "</table>";
            System.out.println(res);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(resultSet, preparedStatement, conn);
        }



    }
}
