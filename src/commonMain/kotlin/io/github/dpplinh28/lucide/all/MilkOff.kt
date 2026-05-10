package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MilkOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8f, 2f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 2f)
                verticalLineToRelative(1.343f)
                moveTo(15f, 2f)
                verticalLineToRelative(2.789f)
                arcToRelative(4f, 4f, 0f, false, false, .672f, 2.219f)
                lineToRelative(.656f, .984f)
                arcToRelative(4f, 4f, 0f, false, true, .672f, 2.22f)
                verticalLineToRelative(1.131f)
                moveTo(7.8f, 7.8f)
                lineToRelative(-.128f, .192f)
                arcTo(4f, 4f, 0f, false, false, 7f, 10.212f)
                verticalLineTo(20f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-3f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 15f)
                arcToRelative(6.47f, 6.47f, 0f, false, true, 5f, 0f)
                arcToRelative(6.472f, 6.472f, 0f, false, false, 3.435f, .435f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 2f)
                lineTo(22f, 22f)
            }
}

public val LucideIcons.All.MilkOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MilkOff: ImageVector
    @Composable get() = MilkOffDefinition.asImageVector()
