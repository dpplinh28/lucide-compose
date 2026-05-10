package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Spool") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17f, 13.44f)
                lineTo(4.442f, 17.082f)
                arcTo(2f, 2f, 0f, false, false, 4.982f, 21f)
                horizontalLineTo(19f)
                arcToRelative(2f, 2f, 0f, false, false, .558f, -3.921f)
                lineToRelative(-1.115f, -.32f)
                arcTo(2f, 2f, 0f, false, true, 17f, 14.837f)
                verticalLineTo(7.66f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7f, 10.56f)
                lineToRelative(12.558f, -3.642f)
                arcTo(2f, 2f, 0f, false, false, 19.018f, 3f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -.558f, 3.921f)
                lineToRelative(1.115f, .32f)
                arcTo(2f, 2f, 0f, false, true, 7f, 9.163f)
                verticalLineToRelative(7.178f)
            }
}

public val LucideIcons.All.SpoolDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Spool: ImageVector
    @Composable get() = SpoolDefinition.asImageVector()
