package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.HardDrive24: ImageVector
  get() {
    if (_hardDrive24 != null) {
      return _hardDrive24!!
    }
    _hardDrive24 = fluentIcon(name = "Filled.HardDrive24", 24f) {
      materialPath {
          moveTo(7.44F, 4.0F)
          curveTo(6.579F, 4.0F, 5.792F, 4.493F, 5.416F, 5.27F)
          lineTo(2.73F, 10.821F)
          curveTo(3.194F, 10.615F, 3.71F, 10.5F, 4.25F, 10.5F)
          horizontalLineToRelative(15.5F)
          curveToRelative(0.541F, 0.0F, 1.056F, 0.115F, 1.52F, 0.321F)
          lineTo(18.586F, 5.27F)
          curveTo(18.209F, 4.493F, 17.422F, 4.0F, 16.559F, 4.0F)
          horizontalLineTo(7.441F)
          close()
          moveToRelative(12.31F, 8.0F)
          curveToRelative(1.243F, 0.0F, 2.25F, 1.007F, 2.25F, 2.25F)
          verticalLineToRelative(2.5F)
          curveToRelative(0.0F, 1.243F, -1.007F, 2.25F, -2.25F, 2.25F)
          horizontalLineTo(4.25F)
          curveTo(3.007F, 19.0F, 2.0F, 17.993F, 2.0F, 16.75F)
          verticalLineToRelative(-2.5F)
          curveTo(2.0F, 13.007F, 3.007F, 12.0F, 4.25F, 12.0F)
          horizontalLineToRelative(15.5F)
          close()
          moveToRelative(-1.25F, 4.5F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          reflectiveCurveToRelative(-0.448F, -1.0F, -1.0F, -1.0F)
          reflectiveCurveToRelative(-1.0F, 0.448F, -1.0F, 1.0F)
          reflectiveCurveToRelative(0.448F, 1.0F, 1.0F, 1.0F)
          close()        
      }
    }
    return _hardDrive24!!
  }

private var _hardDrive24: ImageVector? = null
