package pl.mpas.git_examples.car.service;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionalExample {
    static Optional<String> getFriendsNick(){
        return Optional.ofNullable(null);
    }

    public static void main(String[] args) {

        System.out.println(getFriendsNick());
    if(getFriendsNick().isPresent())
    {
        String s = getFriendsNick().get();
        System.out.println(s);
    }

    Optional<String> maybeNick = getFriendsNick();
    maybeNick.ifPresent(new Consumer<String>(){
                            @Override
                            public void accept(String s) {

                            }
                        }
    );


    maybeNick.ifPresent(s->{
        System.out.println("Nick: "+s);
    });

    }

}
