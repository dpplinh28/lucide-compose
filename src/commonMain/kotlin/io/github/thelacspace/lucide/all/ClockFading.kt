package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClockFading") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                arcToRelative(10f, 10f, 0f, false, true, 7.38f, 16.75f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 6f)
                verticalLineToRelative(6f)
                lineToRelative(4f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.5f, 8.875f)
                arcToRelative(10f, 10f, 0f, false, false, -.5f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.83f, 16f)
                arcToRelative(10f, 10f, 0f, false, false, 2.43f, 3.4f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.636f, 5.235f)
                arcToRelative(10f, 10f, 0f, false, true, .891f, -.857f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.644f, 21.42f)
                arcToRelative(10f, 10f, 0f, false, false, 7.631f, -.38f)
            }
}

public val LucideIcons.All.ClockFadingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClockFading: ImageVector
    @Composable get() = ClockFadingDefinition.asImageVector()
