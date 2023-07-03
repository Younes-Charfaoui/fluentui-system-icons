package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.DocumentOnePageColumns24: ImageVector
  get() {
    if (_documentOnePageColumns24 != null) {
      return _documentOnePageColumns24!!
    }
    _documentOnePageColumns24 = fluentIcon(name = "Regular.DocumentOnePageColumns24", 24f) {
      materialPath {
          moveTo(4.0F, 4.25F)
          curveTo(4.0F, 3.007F, 5.007F, 2.0F, 6.25F, 2.0F)
          horizontalLineToRelative(11.5F)
          curveTo(18.993F, 2.0F, 20.0F, 3.007F, 20.0F, 4.25F)
          verticalLineToRelative(15.5F)
          curveToRelative(0.0F, 1.243F, -1.007F, 2.25F, -2.25F, 2.25F)
          horizontalLineTo(6.25F)
          curveTo(5.007F, 22.0F, 4.0F, 20.993F, 4.0F, 19.75F)
          verticalLineTo(4.25F)
          close()
          moveTo(6.25F, 3.5F)
          curveTo(5.836F, 3.5F, 5.5F, 3.836F, 5.5F, 4.25F)
          verticalLineToRelative(15.5F)
          curveToRelative(0.0F, 0.414F, 0.336F, 0.75F, 0.75F, 0.75F)
          horizontalLineToRelative(11.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          verticalLineTo(4.25F)
          curveToRelative(0.0F, -0.414F, -0.336F, -0.75F, -0.75F, -0.75F)
          horizontalLineTo(6.25F)
          close()
          moveToRelative(3.0F, 1.5F)
          curveTo(9.664F, 5.0F, 10.0F, 5.336F, 10.0F, 5.75F)
          verticalLineToRelative(12.5F)
          curveTo(10.0F, 18.664F, 9.664F, 19.0F, 9.25F, 19.0F)
          reflectiveCurveTo(8.5F, 18.664F, 8.5F, 18.25F)
          verticalLineTo(5.75F)
          curveTo(8.5F, 5.336F, 8.836F, 5.0F, 9.25F, 5.0F)
          close()
          moveToRelative(6.25F, 0.75F)
          curveTo(15.5F, 5.336F, 15.164F, 5.0F, 14.75F, 5.0F)
          reflectiveCurveTo(14.0F, 5.336F, 14.0F, 5.75F)
          verticalLineToRelative(12.5F)
          curveToRelative(0.0F, 0.414F, 0.336F, 0.75F, 0.75F, 0.75F)
          reflectiveCurveToRelative(0.75F, -0.336F, 0.75F, -0.75F)
          verticalLineTo(5.75F)
          close()        
      }
    }
    return _documentOnePageColumns24!!
  }

private var _documentOnePageColumns24: ImageVector? = null
