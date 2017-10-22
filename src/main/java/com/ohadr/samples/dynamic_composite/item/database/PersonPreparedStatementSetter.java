package com.ohadr.samples.dynamic_composite.item.database;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.springframework.batch.item.database.ItemPreparedStatementSetter;
import org.springframework.stereotype.Repository;
import com.ohadr.samples.dynamic_composite.Person;

@Repository
public class PersonPreparedStatementSetter implements ItemPreparedStatementSetter<Person>
{

	@Override
	public void setValues(Person item, PreparedStatement preparedStatement) throws SQLException
	{
        preparedStatement.setString(1, item.getFirstName());
        preparedStatement.setString(2, item.getLastName());
//        preparedStatement.setString(3, item.getPurchasedPackage());
	}

}
