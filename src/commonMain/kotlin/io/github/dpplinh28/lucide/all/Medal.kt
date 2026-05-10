package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Medal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.21f, 15f)
                lineTo(2.66f, 7.14f)
                arcToRelative(2f, 2f, 0f, false, true, .13f, -2.2f)
                lineTo(4.4f, 2.8f)
                arcTo(2f, 2f, 0f, false, true, 6f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 1.6f, .8f)
                lineToRelative(1.6f, 2.14f)
                arcToRelative(2f, 2f, 0f, false, true, .14f, 2.2f)
                lineTo(16.79f, 15f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 12f)
                lineTo(5.12f, 2.2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(13f, 12f)
                lineToRelative(5.88f, -9.8f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 7f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f, 17.0f)
                arcToRelative(5.0f, 5.0f, 0f, true, false, 10.0f, 0f)
                arcToRelative(5.0f, 5.0f, 0f, true, false, -10.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 18f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-.5f)
            }
}

public val LucideIcons.All.MedalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Medal: ImageVector
    @Composable get() = MedalDefinition.asImageVector()
