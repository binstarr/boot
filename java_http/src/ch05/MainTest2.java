package ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import ch01.Todo;
import lombok.Data;

public class MainTest2 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/users");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.connect();

			int statusCode = connection.getResponseCode();
			System.out.println("statusCode : " + statusCode); // 에러가 뜨면 404뜸!
			// 이제 읽어줘야함
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			StringBuffer stringBuffer = new StringBuffer();
			String line = null;
			if (statusCode == 200) {
				while ((line = bufferedReader.readLine()) != null) {
					stringBuffer.append(line + "\n");
				}
			}
			String str = stringBuffer.toString();
//			System.out.println(str);

			Gson gson = new Gson();
			Type type = new TypeToken<ArrayList<Users>>() {
			}.getType();
			ArrayList<Users> arrayList = gson.fromJson(str, type);

//			System.out.println(arrayList);
			System.out.println(arrayList.get(2));
			System.out.println(arrayList.get(2).getName());
			System.out.println(arrayList.get(2).getCompany().getName());

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
