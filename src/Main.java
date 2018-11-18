import java.util.List;

import com.sahurjt.objectcsv.CsvDelimiter;
import com.sahurjt.objectcsv.CsvHolder;
import com.sahurjt.objectcsv.ObjectCsv;
import com.sahurjt.objectcsv.ObjectCsvException;

public class Main {

	private static final String FILE_PATH_1 = ".\\matches.csv";

	public static void main(String[] args) {
		try {
			test();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void test() throws ObjectCsvException {
		CsvHolder<SampleMatchModel> holder = ObjectCsv.getInstance().from(FILE_PATH_1).with(CsvDelimiter.COMMA)
				.getCsvHolderforClass(SampleMatchModel.class);

		List<SampleMatchModel> models = holder.getCsvRecords();

		System.out.println(holder.getContent());
		for (SampleMatchModel m : models) {
			System.out.println(m);
		}
	}
}
