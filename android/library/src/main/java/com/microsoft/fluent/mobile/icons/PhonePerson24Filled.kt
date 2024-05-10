package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PhonePerson24: ImageVector
  get() {
    if (_phonePerson24 != null) {
      return _phonePerson24!!
    }
    _phonePerson24 = fluentIcon(name = "Filled.PhonePerson24", 24f) {
      materialPath {
          moveTo(13.75F, 2.0F)
          curveTo(14.993F, 2.0F, 16.0F, 3.007F, 16.0F, 4.25F)
          verticalLineToRelative(7.087F)
          curveToRelative(-1.182F, 0.562F, -2.0F, 1.767F, -2.0F, 3.163F)
          curveToRelative(0.0F, 0.98F, 0.402F, 1.865F, 1.05F, 2.5F)
          horizontalLineToRelative(-0.277F)
          curveTo(13.242F, 17.0F, 12.0F, 18.24F, 12.0F, 19.772F)
          verticalLineToRelative(0.103F)
          curveToRelative(0.0F, 0.74F, 0.214F, 1.48F, 0.665F, 2.125F)
          horizontalLineTo(6.25F)
          curveTo(5.007F, 22.0F, 4.0F, 20.993F, 4.0F, 19.75F)
          verticalLineTo(4.25F)
          curveTo(4.0F, 3.007F, 5.007F, 2.0F, 6.25F, 2.0F)
          horizontalLineToRelative(7.5F)
          close()
          moveToRelative(-2.5F, 16.0F)
          horizontalLineToRelative(-2.5F)
          curveTo(8.336F, 18.0F, 8.0F, 18.336F, 8.0F, 18.75F)
          reflectiveCurveToRelative(0.336F, 0.75F, 0.75F, 0.75F)
          horizontalLineToRelative(2.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          reflectiveCurveTo(11.664F, 18.0F, 11.25F, 18.0F)
          close()
          moveTo(20.0F, 14.5F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          reflectiveCurveTo(15.0F, 15.88F, 15.0F, 14.5F)
          reflectiveCurveToRelative(1.12F, -2.5F, 2.5F, -2.5F)
          reflectiveCurveToRelative(2.5F, 1.12F, 2.5F, 2.5F)
          close()
          moveToRelative(2.0F, 5.375F)
          curveTo(22.0F, 21.431F, 20.714F, 23.0F, 17.5F, 23.0F)
          reflectiveCurveTo(13.0F, 21.437F, 13.0F, 19.875F)
          verticalLineToRelative(-0.103F)
          curveTo(13.0F, 18.792F, 13.794F, 18.0F, 14.773F, 18.0F)
          horizontalLineToRelative(5.454F)
          curveTo(21.207F, 18.0F, 22.0F, 18.793F, 22.0F, 19.772F)
          verticalLineToRelative(0.103F)
          close()        
      }
    }
    return _phonePerson24!!
  }

private var _phonePerson24: ImageVector? = null
