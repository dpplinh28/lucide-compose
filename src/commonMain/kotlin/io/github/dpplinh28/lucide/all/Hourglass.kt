package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Hourglass") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5f, 22f)
                horizontalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 2f)
                horizontalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 22f)
                verticalLineToRelative(-4.172f)
                arcToRelative(2f, 2f, 0f, false, false, -.586f, -1.414f)
                lineTo(12f, 12f)
                lineToRelative(-4.414f, 4.414f)
                arcTo(2f, 2f, 0f, false, false, 7f, 17.828f)
                verticalLineTo(22f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 2f)
                verticalLineToRelative(4.172f)
                arcToRelative(2f, 2f, 0f, false, false, .586f, 1.414f)
                lineTo(12f, 12f)
                lineToRelative(4.414f, -4.414f)
                arcTo(2f, 2f, 0f, false, false, 17f, 6.172f)
                verticalLineTo(2f)
            }
}

public val LucideIcons.All.HourglassDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Hourglass: ImageVector
    @Composable get() = HourglassDefinition.asImageVector()
