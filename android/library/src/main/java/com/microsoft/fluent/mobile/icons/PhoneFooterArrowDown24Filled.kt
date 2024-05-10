package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PhoneFooterArrowDown24: ImageVector
  get() {
    if (_phoneFooterArrowDown24 != null) {
      return _phoneFooterArrowDown24!!
    }
    _phoneFooterArrowDown24 = fluentIcon(name = "Filled.PhoneFooterArrowDown24", 24f) {
      materialPath {
          moveTo(18.0F, 4.25F)
          curveTo(18.0F, 3.007F, 16.993F, 2.0F, 15.75F, 2.0F)
          horizontalLineToRelative(-7.5F)
          curveTo(7.007F, 2.0F, 6.0F, 3.007F, 6.0F, 4.25F)
          verticalLineToRelative(15.5F)
          curveTo(6.0F, 20.993F, 7.007F, 22.0F, 8.25F, 22.0F)
          horizontalLineToRelative(7.5F)
          curveToRelative(1.243F, 0.0F, 2.25F, -1.007F, 2.25F, -2.25F)
          verticalLineTo(4.25F)
          close()
          moveToRelative(-9.5F, 14.0F)
          curveToRelative(0.0F, -0.414F, 0.336F, -0.75F, 0.75F, -0.75F)
          horizontalLineToRelative(5.5F)
          lineToRelative(0.102F, 0.007F)
          curveToRelative(0.366F, 0.05F, 0.648F, 0.363F, 0.648F, 0.743F)
          curveToRelative(0.0F, 0.414F, -0.336F, 0.75F, -0.75F, 0.75F)
          horizontalLineToRelative(-5.5F)
          lineToRelative(-0.102F, -0.007F)
          curveTo(8.782F, 18.943F, 8.5F, 18.63F, 8.5F, 18.25F)
          close()
          moveTo(11.993F, 16.0F)
          curveToRelative(-0.199F, -0.002F, -0.389F, -0.083F, -0.528F, -0.225F)
          lineToRelative(-2.45F, -2.5F)
          curveToRelative(-0.29F, -0.296F, -0.285F, -0.77F, 0.01F, -1.06F)
          curveToRelative(0.297F, -0.29F, 0.771F, -0.286F, 1.061F, 0.01F)
          lineToRelative(1.164F, 1.187F)
          verticalLineTo(9.75F)
          curveTo(11.25F, 9.336F, 11.586F, 9.0F, 12.0F, 9.0F)
          reflectiveCurveToRelative(0.75F, 0.336F, 0.75F, 0.75F)
          verticalLineToRelative(3.715F)
          lineToRelative(1.275F, -1.25F)
          curveToRelative(0.296F, -0.29F, 0.77F, -0.286F, 1.06F, 0.01F)
          curveToRelative(0.29F, 0.296F, 0.286F, 0.77F, -0.01F, 1.06F)
          lineToRelative(-2.55F, 2.5F)
          curveToRelative(-0.141F, 0.14F, -0.333F, 0.217F, -0.532F, 0.215F)
          close()        
      }
    }
    return _phoneFooterArrowDown24!!
  }

private var _phoneFooterArrowDown24: ImageVector? = null
