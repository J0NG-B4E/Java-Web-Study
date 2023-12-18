package org.zerock.springex.sample;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Qualifier;

@Repository
@Qualifier("normal")
public class SampleDAOImpl implements SampleDAO {
}
