package model;

import entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Model {
    private static Model instance = new Model();

    private List<User> model;

    public static Model getInstance() {
        return instance;
    }

    private Model() {
        model = new ArrayList<>();
    }

    public void add(User user) {
        model.add(user);
    }

    public List<String> list() {
        return model.stream()
                .map(User::getName)
                .collect(Collectors.toList());
    }

    public boolean getUser(User newUser) {
        Optional<User> user = model.stream()
                                   .filter(newUser::equals)
                                   .findAny();
        return user.isPresent();
    }
}
