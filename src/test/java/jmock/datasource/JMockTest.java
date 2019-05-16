package jmock.datasource;

import javax.sql.DataSource;

import org.jmock.Mockery;
import org.jmock.imposters.ByteBuddyClassImposteriser;
import org.junit.Test;

public class JMockTest {
    
    @Test
    public void tryToMockSqlDataSourceWithByteBuddy() {
        final Mockery mockery = new Mockery();
        mockery.setImposteriser(ByteBuddyClassImposteriser.INSTANCE);

        final DataSource dataSourceMock = mockery.mock(DataSource.class);
        
        mockery.assertIsSatisfied();
    }
}
