# Generated by Django 3.2.7 on 2021-11-21 15:45

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('authApp', '0002_alter_user_telefono'),
    ]

    operations = [
        migrations.AlterField(
            model_name='user',
            name='telefono',
            field=models.BigIntegerField(blank=True, default=None, null=True, verbose_name='Telefono'),
        ),
    ]
