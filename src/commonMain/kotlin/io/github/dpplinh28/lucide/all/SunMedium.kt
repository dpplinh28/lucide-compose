package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SunMedium") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, 8.0f, 0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, -8.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 3f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 20f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 12f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 12f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(18.364f, 5.636f)
                lineToRelative(-.707f, .707f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6.343f, 17.657f)
                lineToRelative(-.707f, .707f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(5.636f, 5.636f)
                lineToRelative(.707f, .707f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(17.657f, 17.657f)
                lineToRelative(.707f, .707f)
            }
}

public val LucideIcons.All.SunMediumDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SunMedium: ImageVector
    @Composable get() = SunMediumDefinition.asImageVector()
