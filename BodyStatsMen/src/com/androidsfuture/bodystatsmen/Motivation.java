package com.androidsfuture.bodystatsmen;



import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Motivation extends Activity implements OnClickListener {
	

	@Override
	public void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	  setContentView(R.layout.motivation);
	  
	  
	 
	 //Set OnClickListeners so that when the user touches the link it does something
	  TextView tvTransform = (TextView)this.findViewById(R.id.Tranformation);
	  		tvTransform.setOnClickListener(this);
	  TextView tvBodybuildingLink = (TextView)this.findViewById(R.id.BodybuildingLink);
	  		tvBodybuildingLink.setOnClickListener(this);
	  TextView tvModLink = (TextView)this.findViewById(R.id.MoDLink);
	  		tvModLink.setOnClickListener(this);
	  TextView tvWomensFitness = (TextView)this.findViewById(R.id.WomensFitnessLink);
	  		tvWomensFitness.setOnClickListener(this);
	  TextView tvWomensFitnessLink = (TextView)this.findViewById(R.id.WomensFitnessLink);
	  		tvWomensFitnessLink.setOnClickListener(this);
	  TextView tvBiggestLooserClub = (TextView)this.findViewById(R.id.BiggestLooserClub);
	  		tvBiggestLooserClub.setOnClickListener(this);
	  TextView tvBiggestLooserLink = (TextView)this.findViewById(R.id.BiggestLooserLink);
	  		tvBiggestLooserLink.setOnClickListener(this);
	  TextView tvWeightLossMotivation = (TextView)this.findViewById(R.id.WeightLossMotivation);
	  		tvWeightLossMotivation.setOnClickListener(this);
	  TextView tvWLMBLink = (TextView)this.findViewById(R.id.WLMBLink);
	  		tvWLMBLink.setOnClickListener(this);
	  TextView tvMakingWeightLossFun = (TextView)this.findViewById(R.id.MakingWeightLossFun);
	  		tvMakingWeightLossFun.setOnClickListener(this);
	  TextView tvMWLFLink = (TextView)this.findViewById(R.id.MWLFLink);
	  		tvMWLFLink.setOnClickListener(this);	
	  TextView tvGoalSetting = (TextView)this.findViewById(R.id.GoalSetting);
	  		tvGoalSetting.setOnClickListener(this);
	  TextView tvGoalSettingLink = (TextView)this.findViewById(R.id.GoalSettingLink);
	  		tvGoalSettingLink.setOnClickListener(this);
	  TextView tvExerciseMotivation = (TextView)this.findViewById(R.id.Exercise_Motivation);
	  		tvExerciseMotivation.setOnClickListener(this);
	  TextView tvExerciseMotivationLink = (TextView)this.findViewById(R.id.Exercise_MotivationLink);
	  		tvExerciseMotivationLink.setOnClickListener(this);
	  
	  		
	  //Newest links -- YouTube Videos
	  TextView tvHundredPound = (TextView)this.findViewById(R.id.Hundred_Pound_Motivation);
	  		tvHundredPound.setOnClickListener(this);
	  TextView tvHundredPoundLink = (TextView)this.findViewById(R.id.Hundred_Pound_Link);
	  		tvHundredPoundLink.setOnClickListener(this);
	  TextView tvWhatIAteMotivation = (TextView)this.findViewById(R.id.What_I_Ate_Motivation);
	  		tvWhatIAteMotivation.setOnClickListener(this);
	  TextView tvWhatIAteLink = (TextView)this.findViewById(R.id.What_I_Ate_Link);
	  		tvWhatIAteLink.setOnClickListener(this);
	  TextView tvJoyFitBiancaMotivation = (TextView)this.findViewById(R.id.JoyFitBianca_Motivation);
	  		tvJoyFitBiancaMotivation.setOnClickListener(this);
	  TextView tvJoyFitBiancaLink = (TextView)this.findViewById(R.id.JoyFitBianca_Link);
	  		tvJoyFitBiancaLink.setOnClickListener(this);
	  TextView tvJoyFitMom127Motivation = (TextView)this.findViewById(R.id.JoyFitMom127_Motivation);
	  		tvJoyFitMom127Motivation.setOnClickListener(this);
	  TextView tvJoyFitMom127Link = (TextView)this.findViewById(R.id.JoyFitMom127_Link);
	  		tvJoyFitMom127Link.setOnClickListener(this);
	  TextView tvJoyFit300Motivation = (TextView)this.findViewById(R.id.JoyFit300_Motivation);
	  		tvJoyFit300Motivation.setOnClickListener(this);
	  TextView tvJoyFit300Link = (TextView)this.findViewById(R.id.JoyFit300_Link);
	  		tvJoyFit300Link.setOnClickListener(this);
	  TextView tvJoyFit340Motivation = (TextView)this.findViewById(R.id.JoyFit340_Motivation);
	  		tvJoyFit340Motivation.setOnClickListener(this);
	  TextView tvJoyFit340Link = (TextView)this.findViewById(R.id.JoyFit340_Link);
	  		tvJoyFit340Link.setOnClickListener(this);
	  TextView tvKimBensonMotivation = (TextView)this.findViewById(R.id.Kim_Benson_Motivation);
	  		tvKimBensonMotivation.setOnClickListener(this);
	  TextView tvKimBensonLink = (TextView)this.findViewById(R.id.Kim_Benson_Link);
	  		tvKimBensonLink.setOnClickListener(this);
	  TextView tv500Motivation = (TextView)this.findViewById(R.id.Five_Hundred_Motivation);
	  		tv500Motivation.setOnClickListener(this);
	  TextView tv500Link = (TextView)this.findViewById(R.id.Five_Hundred_Link);
	  		tv500Link.setOnClickListener(this);
	  TextView tvShayMotivation = (TextView)this.findViewById(R.id.Shay_Motivation);
	  		tvShayMotivation.setOnClickListener(this);
	  TextView tvShayLink = (TextView)this.findViewById(R.id.Shay_Link);
	  		tvShayLink.setOnClickListener(this);
	  TextView tvAmandaQues1Motivation = (TextView)this.findViewById(R.id.Amanda_Ques_1_Motivation);
	  		tvAmandaQues1Motivation.setOnClickListener(this);
	  TextView tvAmandaQues1Link = (TextView)this.findViewById(R.id.Amanda_Ques_1_Link);
	  		tvAmandaQues1Link.setOnClickListener(this);
	  		
	  //Newest Video Links - Arnold, Johnnie Jackson, Stallone, John Cena
	  TextView tvJohnCena = (TextView)findViewById(R.id.CenaGym);
	  		tvJohnCena.setOnClickListener(this);
	  TextView tvJohnCenaLink = (TextView)findViewById(R.id.CenaGym_Link);
	  		tvJohnCenaLink.setOnClickListener(this);
	  TextView tvArnoldTraining =(TextView)findViewById(R.id.ArnoldTraining);
	  		tvArnoldTraining.setOnClickListener(this);
	  TextView tvArnoldTrainingLink = (TextView)findViewById(R.id.ArnoldTraining_Link);
	  		tvArnoldTrainingLink.setOnClickListener(this);
	  TextView tvStalloneExpendables = (TextView)findViewById(R.id.StalloneExpendables);
	  		tvStalloneExpendables.setOnClickListener(this);
	  TextView tvStalloneExpendablesLink = (TextView)findViewById(R.id.StalloneExpendables_Link);
	  		tvStalloneExpendablesLink.setOnClickListener(this);
	  TextView tvRockyWorkout = (TextView)findViewById(R.id.RockyWorkout);
	  		tvRockyWorkout.setOnClickListener(this);
	  TextView tvRockyWorkoutLink = (TextView)findViewById(R.id.RockyWorkout_Link);
	  		tvRockyWorkoutLink.setOnClickListener(this);
	  TextView tvJohnnieJackson = (TextView)findViewById(R.id.JohnnieJackson);
	  		tvJohnnieJackson.setOnClickListener(this);
	  TextView tvJohnnieJacksonLink = (TextView)findViewById(R.id.JohnnieJackson_Link);
	  		tvJohnnieJacksonLink.setOnClickListener(this);
	}

	public void onClick(View v) {
		 
		// TODO Auto-generated method stub
		switch (v.getId()){
		case R.id.Tranformation:
			Intent transForm = new Intent(Intent.ACTION_VIEW);
			transForm.setData(Uri.parse("http://www.bodybuilding.com/fun/trans_m.htm"));
			startActivity(transForm); 
			break;
			
		case R.id.BodybuildingLink:
			Intent bodyBuild = new Intent(Intent.ACTION_VIEW);
			bodyBuild.setData(Uri.parse("http://www.bodybuilding.com/fun/trans_m.htm"));
			startActivity(bodyBuild);
			break;
			
		case R.id.MoDLink:
			Intent modLink = new Intent(Intent.ACTION_VIEW);
			modLink.setData(Uri.parse("http://menshealth.about.com/cs/obesity/a/lose_weight.htm"));
			startActivity(modLink);
			break;
			
		case R.id.WomensFitnessLink:
			Intent WomensFit = new Intent(Intent.ACTION_VIEW);
			WomensFit.setData(Uri.parse("http://menshealth.about.com/cs/obesity/a/lose_weight.htm"));
			startActivity(WomensFit);
			break;
		
		case R.id.BiggestLooserClub:
			Intent BiggestLooser = new Intent(Intent.ACTION_VIEW);
			BiggestLooser.setData(Uri.parse("http://www.BiggestLoserClub.com"));
			startActivity(BiggestLooser);
			break;
			
		case R.id.BiggestLooserLink:
			Intent BiggestLooserLink = new Intent(Intent.ACTION_VIEW);
			BiggestLooserLink.setData(Uri.parse("http://www.BiggestLoserClub.com"));
			startActivity(BiggestLooserLink);
			break;
		
		case R.id.WeightLossMotivation:
			Intent WeightLossMotivation = new Intent(Intent.ACTION_VIEW);
			WeightLossMotivation.setData(Uri.parse("http://www.menshealth.com/men/fitness/motivation/the-psychology-of-motivation/article/34d70dee29352110VgnVCM10000013281eac"));
			startActivity(WeightLossMotivation);
			break;
			
		case R.id.WLMBLink:
			Intent WLMBLink = new Intent(Intent.ACTION_VIEW);
			WLMBLink.setData(Uri.parse("http://www.menshealth.com/men/fitness/motivation/the-psychology-of-motivation/article/34d70dee29352110VgnVCM10000013281eac"));
			startActivity(WLMBLink);
			break;
		
		case R.id.MakingWeightLossFun:
			Intent MakingWeightLossFun = new Intent(Intent.ACTION_VIEW);
			MakingWeightLossFun.setData(Uri.parse("http://www.menshealth.com/mhlists/James_Bond_workout/Monday_s_Workout.php"));
			startActivity(MakingWeightLossFun);
			break;
			
		case R.id.MWLFLink:
			Intent MWLFLink = new Intent(Intent.ACTION_VIEW);
			MWLFLink.setData(Uri.parse("http://www.menshealth.com/mhlists/James_Bond_workout/Monday_s_Workout.php"));
			startActivity(MWLFLink);
			break;
			
		case R.id.GoalSetting:
			Intent GoalSetting = new Intent(Intent.ACTION_VIEW);
			GoalSetting.setData(Uri.parse("http://www.menshealth.com/mhlists/James_Bond_workout/Tuesday_s_Workout.php"));
			startActivity(GoalSetting);
			break;
			
		case R.id.GoalSettingLink:
			Intent GoalSettingLink = new Intent(Intent.ACTION_VIEW);
			GoalSettingLink.setData(Uri.parse("http://www.menshealth.com/mhlists/James_Bond_workout/Tuesday_s_Workout.php"));
			startActivity(GoalSettingLink);
			break;
			
		case R.id.Exercise_Motivation:
			Intent ExerciseMotivation = new Intent(Intent.ACTION_VIEW);
			ExerciseMotivation.setData(Uri.parse("http://www.menshealth.com/mhlists/James_Bond_workout/Wednesday_s_Workout.php"));
			startActivity(ExerciseMotivation);
			break;
			
		case R.id.Exercise_MotivationLink:
			Intent ExerciseMotivationLink = new Intent(Intent.ACTION_VIEW);
			ExerciseMotivationLink.setData(Uri.parse("http://www.menshealth.com/mhlists/James_Bond_workout/Wednesday_s_Workout.php"));
			startActivity(ExerciseMotivationLink);
			break;
			
		case R.id.Hundred_Pound_Motivation:
			Intent HundredPoundMotivation = new Intent(Intent.ACTION_VIEW);
			HundredPoundMotivation.setData(Uri.parse("http://www.menshealth.com/mhlists/James_Bond_workout/Thursday_s_Workout.php"));
			startActivity(HundredPoundMotivation);
			break;
			
		case R.id.Hundred_Pound_Link:
			Intent HundredPoundLink = new Intent(Intent.ACTION_VIEW);
			HundredPoundLink.setData(Uri.parse("http://www.menshealth.com/mhlists/James_Bond_workout/Thursday_s_Workout.php"));
			startActivity(HundredPoundLink);
			break;
			
		case R.id.What_I_Ate_Motivation:
			Intent WhatIAteMotivation = new Intent(Intent.ACTION_VIEW);
			WhatIAteMotivation.setData(Uri.parse("http://www.menshealth.com/mhlists/James_Bond_workout/Friday_s_Workout.php"));
			startActivity(WhatIAteMotivation);
			break;
			
		case R.id.What_I_Ate_Link:
			Intent WhatIAteLink = new Intent(Intent.ACTION_VIEW);
			WhatIAteLink.setData(Uri.parse("http://www.menshealth.com/mhlists/James_Bond_workout/Friday_s_Workout.php"));
			startActivity(WhatIAteLink);
			break;
			
		case R.id.JoyFitBianca_Motivation:
			Intent JoyFitBiancaMotivation = new Intent(Intent.ACTION_VIEW);
			JoyFitBiancaMotivation.setData(Uri.parse("http://www.menshealth.com/mhlists/James_Bond_workout/Saturday_s_Workout.php"));
			startActivity(JoyFitBiancaMotivation);
			break;
			
		case R.id.JoyFitBianca_Link:
			Intent JoyFitBiancaLink = new Intent(Intent.ACTION_VIEW);
			JoyFitBiancaLink.setData(Uri.parse("http://www.menshealth.com/mhlists/James_Bond_workout/Saturday_s_Workout.php"));
			startActivity(JoyFitBiancaLink);
			break;
			
		case R.id.JoyFitMom127_Motivation:
			Intent JoyFitMom127Motivation = new Intent(Intent.ACTION_VIEW);
			JoyFitMom127Motivation.setData(Uri.parse("http://www.menshealth.com/mhlists/James_Bond_workout/Sunday_s_Workout.php"));
			startActivity(JoyFitMom127Motivation);
			break;
			
		case R.id.JoyFitMom127_Link:
			Intent JoyFitMom127Link = new Intent(Intent.ACTION_VIEW);
			JoyFitMom127Link.setData(Uri.parse("http://www.menshealth.com/mhlists/James_Bond_workout/Sunday_s_Workout.php"));
			startActivity(JoyFitMom127Link);
			break;
			
		case R.id.JoyFit300_Motivation:
			Intent JoyFit300Motivation = new Intent(Intent.ACTION_VIEW);
			JoyFit300Motivation.setData(Uri.parse("http://www.youtube.com/watch?v=TedoeY98tIY"));
			startActivity(JoyFit300Motivation);
			break;
			
		case R.id.JoyFit300_Link:
			Intent JoyFit300Link = new Intent(Intent.ACTION_VIEW);
			JoyFit300Link.setData(Uri.parse("http://www.youtube.com/watch?v=TedoeY98tIY"));
			startActivity(JoyFit300Link);
			break;
			
		case R.id.JoyFit340_Motivation:
			Intent JoyFit340Motivation = new Intent(Intent.ACTION_VIEW);
			JoyFit340Motivation.setData(Uri.parse("http://www.youtube.com/watch?v=lTqLqSm-sPs"));
			startActivity(JoyFit340Motivation);
			break;
			
		case R.id.JoyFit340_Link:
			Intent JoyFit340Link = new Intent(Intent.ACTION_VIEW);
			JoyFit340Link.setData(Uri.parse("http://www.youtube.com/watch?v=lTqLqSm-sPs"));
			startActivity(JoyFit340Link);
			break;
			
		case R.id.Kim_Benson_Motivation:
			Intent KimBensonMotivation = new Intent(Intent.ACTION_VIEW);
			KimBensonMotivation.setData(Uri.parse("http://www.youtube.com/watch?v=OP3M456xfKk&feature=PlayList&p=C6835ADA713B4511&playnext_from=PL&playnext=1&index=11"));
			startActivity(KimBensonMotivation);
			break;
			
		case R.id.Kim_Benson_Link:
			Intent KimBensonLink = new Intent(Intent.ACTION_VIEW);
			KimBensonLink.setData(Uri.parse("http://www.youtube.com/watch?v=OP3M456xfKk&feature=PlayList&p=C6835ADA713B4511&playnext_from=PL&playnext=1&index=11"));
			startActivity(KimBensonLink);
			break;
			
		case R.id.Five_Hundred_Motivation:
			Intent FiveHundredMotivation = new Intent(Intent.ACTION_VIEW);
			FiveHundredMotivation.setData(Uri.parse("http://www.youtube.com/watch?v=dnsxcDrC-MY&feature=related"));
			startActivity(FiveHundredMotivation);
			break;
			
		case R.id.Five_Hundred_Link:
			Intent FiveHundredLink = new Intent(Intent.ACTION_VIEW);
			FiveHundredLink.setData(Uri.parse("http://www.youtube.com/watch?v=dnsxcDrC-MY&feature=related"));
			startActivity(FiveHundredLink);
			break;
			
		case R.id.Shay_Motivation:
			Intent ShayMotivation = new Intent(Intent.ACTION_VIEW);
			ShayMotivation.setData(Uri.parse("http://www.youtube.com/watch?v=KBHu_wi5FaI&feature=related"));
			startActivity(ShayMotivation);
			break;
			
		case R.id.Shay_Link:
			Intent ShayLink = new Intent(Intent.ACTION_VIEW);
			ShayLink.setData(Uri.parse("http://www.youtube.com/watch?v=KBHu_wi5FaI&feature=related"));
			startActivity(ShayLink);
			break;
			
		case R.id.Amanda_Ques_1_Motivation:
			Intent AmandaQues1Motivation = new Intent(Intent.ACTION_VIEW);
			AmandaQues1Motivation.setData(Uri.parse("http://www.youtube.com/watch?v=ZKYskd4ajNY&feature=related"));
			startActivity(AmandaQues1Motivation);
			break;
			
		case R.id.Amanda_Ques_1_Link:
			Intent AmandaQues1Link = new Intent(Intent.ACTION_VIEW);
			AmandaQues1Link.setData(Uri.parse("http://www.youtube.com/watch?v=ZKYskd4ajNY&feature=related"));
			startActivity(AmandaQues1Link);
			break;
			
		case R.id.CenaGym:
			Intent CenaGym = new Intent(Intent.ACTION_VIEW);
			CenaGym.setData(Uri.parse("http://www.youtube.com/watch?v=ZfzgbHjYgMg&feature=related"));
			startActivity(CenaGym);
			break;
			
		case R.id.CenaGym_Link:
			Intent CenaGymLink = new Intent(Intent.ACTION_VIEW);
			CenaGymLink.setData(Uri.parse("http://www.youtube.com/watch?v=ZfzgbHjYgMg&feature=related"));
			startActivity(CenaGymLink);
			break;
			
		case R.id.ArnoldTraining:
			Intent ArnoldTraining = new Intent(Intent.ACTION_VIEW);
			ArnoldTraining.setData(Uri.parse("http://www.youtube.com/watch?v=my6IroYcyEI&feature=related"));
			startActivity(ArnoldTraining);
			break;
			
		case R.id.ArnoldTraining_Link:
			Intent ArnoldTrainingLink = new Intent(Intent.ACTION_VIEW);
			ArnoldTrainingLink.setData(Uri.parse("http://www.youtube.com/watch?v=my6IroYcyEI&feature=related"));
			startActivity(ArnoldTrainingLink);
			break;
			
		case R.id.StalloneExpendables:
			Intent StalloneExpendables = new Intent(Intent.ACTION_VIEW);
			StalloneExpendables.setData(Uri.parse("http://www.youtube.com/watch?v=3CBv3KuNJ7s"));
			startActivity(StalloneExpendables);
			break;
			
		case R.id.StalloneExpendables_Link:
			Intent StalloneExpendablesLink = new Intent(Intent.ACTION_VIEW);
			StalloneExpendablesLink.setData(Uri.parse("http://www.youtube.com/watch?v=3CBv3KuNJ7s"));
			startActivity(StalloneExpendablesLink);
			break;
			
		case R.id.RockyWorkout:
			Intent RockyWorkout = new Intent(Intent.ACTION_VIEW);
			RockyWorkout.setData(Uri.parse("http://www.youtube.com/watch?v=qJNp2z9gQNY&NR=1"));
			startActivity(RockyWorkout);
			break;
			
		case R.id.RockyWorkout_Link:
			Intent RockyWorkoutLink = new Intent(Intent.ACTION_VIEW);
			RockyWorkoutLink.setData(Uri.parse("http://www.youtube.com/watch?v=qJNp2z9gQNY&NR=1"));
			startActivity(RockyWorkoutLink);
			break;
			
		case R.id.JohnnieJackson:
			Intent JohnnieJackson = new Intent(Intent.ACTION_VIEW);
			JohnnieJackson.setData(Uri.parse("http://www.youtube.com/watch?v=H6qFk7YkeoM&feature=related"));
			startActivity(JohnnieJackson);
			break;
			
		case R.id.JohnnieJackson_Link:
			Intent JohnnieJacksonLink = new Intent(Intent.ACTION_VIEW);
			JohnnieJacksonLink.setData(Uri.parse("http://www.youtube.com/watch?v=H6qFk7YkeoM&feature=related"));
			startActivity(JohnnieJacksonLink);
			break;
	} 
		
	}
	
}
