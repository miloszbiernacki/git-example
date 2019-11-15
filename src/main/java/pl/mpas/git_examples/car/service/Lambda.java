package pl.mpas.git_examples.car.service;

@FunctionalInterface
public interface Lambda {
    int Lambda2(int a,int b);
    default int Lambda3(String s ){
      return 0;
    };

}
