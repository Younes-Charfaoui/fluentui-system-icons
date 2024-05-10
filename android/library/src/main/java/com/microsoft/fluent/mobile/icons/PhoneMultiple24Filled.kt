package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PhoneMultiple24: ImageVector
  get() {
    if (_phoneMultiple24 != null) {
      return _phoneMultiple24!!
    }
    _phoneMultiple24 = fluentIcon(name = "Filled.PhoneMultiple24", 24f) {
      materialPath {
          moveTo(8.25F, 2.0F)
          curveTo(7.007F, 2.0F, 6.0F, 3.007F, 6.0F, 4.25F)
          verticalLineToRelative(13.0F)
          curveToRelative(0.0F, 1.243F, 1.007F, 2.25F, 2.25F, 2.25F)
          horizontalLineToRelative(5.5F)
          curveToRelative(1.243F, 0.0F, 2.25F, -1.007F, 2.25F, -2.25F)
          verticalLineToRelative(-13.0F)
          curveTo(16.0F, 3.007F, 14.993F, 2.0F, 13.75F, 2.0F)
          horizontalLineToRelative(-5.5F)
          close()
          moveTo(9.0F, 16.25F)
          curveToRelative(0.0F, -0.414F, 0.336F, -0.75F, 0.75F, -0.75F)
          horizontalLineToRelative(2.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, 0.336F, 0.75F, 0.75F)
          reflectiveCurveTo(12.664F, 17.0F, 12.25F, 17.0F)
          horizontalLineToRelative(-2.5F)
          curveTo(9.336F, 17.0F, 9.0F, 16.664F, 9.0F, 16.25F)
          close()
          moveTo(10.75F, 22.0F)
          curveToRelative(-0.98F, 0.0F, -1.813F, -0.626F, -2.122F, -1.5F)
          horizontalLineToRelative(5.622F)
          curveToRelative(1.519F, 0.0F, 2.75F, -1.231F, 2.75F, -2.75F)
          verticalLineTo(4.628F)
          curveToRelative(0.874F, 0.309F, 1.5F, 1.142F, 1.5F, 2.122F)
          verticalLineToRelative(11.0F)
          curveToRelative(0.0F, 2.347F, -1.903F, 4.25F, -4.25F, 4.25F)
          horizontalLineToRelative(-3.5F)
          close()        
      }
    }
    return _phoneMultiple24!!
  }

private var _phoneMultiple24: ImageVector? = null
