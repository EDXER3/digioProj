package com.example.digiotest.model;

public class test {
    /*
    @PostMapping(path = "/addCourse") // Map ONLY POST Requests
    public @ResponseBody
    String addNewCourse(@RequestBody String jsonObj) {
        Subject_StudentDTO modelDTO = new Subject_StudentDTO();
        ObjectMapper objectMapper = new ObjectMapper();
        Iterable<Students_Subjects> students_subjectsIterable = new ArrayList<>();
        Iterator<Students_Subjects> subjectsIterator = students_subjectsIterable.iterator();
        Optional<Subject> optionalStudentsSubjects = null;
        LocalTime startDt = LocalTime.now();
        LocalTime endDt = LocalTime.now();


//        System.out.println(optionalStudentsSubjects.get().getSubject().getSubject_id());

        try {
            modelDTO = objectMapper.readValue(jsonObj, Subject_StudentDTO.class);
            students_subjectsIterable = studentsSubjectsRepository.findAll();
            boolean check = false;
            if ((int) studentsSubjectsRepository.countAllByStudent_Id(modelDTO.getStudent_id()) < 8) {
                optionalStudentsSubjects = subjectRepository.findById(modelDTO.getSubject_id());
                startDt = optionalStudentsSubjects.get().getStart_date();
                endDt = optionalStudentsSubjects.get().getEnd_date();
                for (Students_Subjects str : students_subjectsIterable) {

                    if ((((str.getSubject().getStart_date().isAfter(startDt) || str.getSubject().getStart_date().equals(startDt)) && (str.getSubject().getStart_date().isBefore(endDt) || str.getSubject().getStart_date().equals(endDt))) ||
                            ((str.getSubject().getEnd_date().isAfter(startDt) || str.getSubject().getEnd_date().equals(startDt)) && (str.getSubject().getEnd_date().isBefore(endDt) || str.getSubject().getEnd_date().equals(endDt)))) &&
                            (str.getSubject().getDay()).equalsIgnoreCase(optionalStudentsSubjects.get().getDay())) {
                        System.out.println("find time " + str.getSubject().getId());
                        System.out.println("Is time fine " + startDt + " <>" + endDt + " ** "
                                + str.getSubject().getStart_date().getHour() + ":" + str.getSubject().getStart_date().getMinute() + " <> " + str.getSubject().getEnd_date().getHour() + ":" + str.getSubject().getEnd_date().getMinute());
                        check = true;
                        break;
                    }
                    System.out.println(" >>>(" + str.getSubject().getStart_date().isAfter(startDt) +
                            "+" + str.getSubject().getStart_date().equals(startDt) +
                            "+" + str.getSubject().getStart_date().isBefore(endDt) +
                            "+" + str.getSubject().getStart_date().equals(endDt) +
                            ")+(" + ((str.getSubject().getEnd_date().isAfter(startDt)) +
                            "+" + str.getSubject().getEnd_date().equals(startDt) +
                            "+" + (str.getSubject().getEnd_date().isBefore(endDt) +
                            "+" + str.getSubject().getEnd_date().equals(endDt) + ") && (" + (str.getSubject().getDay()).equalsIgnoreCase(optionalStudentsSubjects.get().getDay()) + ") && (" + str.getSubject().getDay() + " | " + optionalStudentsSubjects.get().getDay())));
                    System.out.println(startDt + " <>" + endDt + " ** "
                            + str.getSubject().getStart_date().getHour() + ":" + str.getSubject().getStart_date().getMinute() + " <> " + str.getSubject().getEnd_date().getHour() + ":" + str.getSubject().getEnd_date().getMinute());
                }

                if (check == false) {
                    Students_Subjects studentsSubjects = new Students_Subjects();
                    Student student = new Student(modelDTO.getStudent_id());
                    Subject subject = new Subject(modelDTO.getSubject_id());
                    studentsSubjects.setStudent(student);
                    studentsSubjects.setSubject(subject);
                    studentsSubjectsRepository.save(studentsSubjects);
                    return "Saved " + studentsSubjectsRepository.countAllByStudent_Id(modelDTO.getStudent_id());
                } else {
                    return "Cannot Save Duplicate time " + optionalStudentsSubjects.get().getStart_date()+" - "+optionalStudentsSubjects.get().getEnd_date();
                }

            } else {
                return "Cannot register no more than 8 subjects. ";
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            return "error";
        }


    }

     */
}
