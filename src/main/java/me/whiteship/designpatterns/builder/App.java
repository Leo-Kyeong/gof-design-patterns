package me.whiteship.designpatterns.builder;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        TourPlan shortTrip = new TourPlan();
        shortTrip.setTitle("오레곤 롱비치 여행");
        shortTrip.setStartDate(LocalDate.of(2021,7,15));

        TourPlan tourPlan = new TourPlan();
        tourPlan.setTitle("칸쿤 여행");
        tourPlan.setNights(2);
        tourPlan.setDays(3);
        tourPlan.setStartDate(LocalDate.of(2020, 12, 9));
        tourPlan.setWhereToStay("리조트");
        tourPlan.getPlans().add(new DetailPlan(0, "체크인 이후 잠 풀기"));
        tourPlan.getPlans().add(new DetailPlan(0, "저녁 식사"));
        tourPlan.getPlans().add(new DetailPlan(1, "조식 부페에서 식사"));
        tourPlan.getPlans().add(new DetailPlan(1, "해변가 산책"));
        tourPlan.getPlans().add(new DetailPlan(1, "점심은 수영장 근처 음식점에서 먹기"));
        tourPlan.getPlans().add(new DetailPlan(1, "리조트 수영장에서 놀기"));
        tourPlan.getPlans().add(new DetailPlan(1, "저녁은 BBQ 식당에서 스테이크"));
        tourPlan.getPlans().add(new DetailPlan(2, "조식은 부페에서 식사"));
        tourPlan.getPlans().add(new DetailPlan(2, "체크아웃"));

        TourPlanBuilder builder = new DefaultTourBuilder();
        TourPlan plan = builder.title("칸쿤 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2020, 12, 9))
                .whereToStay("리조트")
                .addPlan(0, "체크인하고 짐 풀기")
                .addPlan(0, "저녁 식사")
                .getPlan();

        TourPlan longBeachPlan = builder.title("롱비치")
                .startDate(LocalDate.of(2021, 7, 15))
                .getPlan();

        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan1 = director.cancunTrip();
        TourPlan tourPlan2 = director.longBeach();
    }
}
