



package com.example.openhealth;

        import com.android.volley.AuthFailureError;
        import com.android.volley.Response;
        import com.android.volley.toolbox.StringRequest;

        import java.util.HashMap;
        import java.util.Map;

public class RequestPulse extends StringRequest {

    final static private String URL = "http://192.168.0.123/UserLogin.php"; //라즈베리파이 주소
    private Map<String, String> parameters;

    public RequestPulse(String pulseData, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("pulseData", pulseData);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError{
        return parameters;
    }

}
