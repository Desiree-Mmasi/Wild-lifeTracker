public class Feedback {
        private String Name;
        private String Response;
        private String Submit;

    public Feedback (String name, String response, String submit) {
        Name = name;
        Response = response;
        Submit = submit;
    }

    public String getName () {
        return Name;
    }

    public String getResponse () {
        return Response;
    }

    public String getSubmit () {
        return Submit;
    }
}

