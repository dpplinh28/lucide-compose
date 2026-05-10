package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AudioLines") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 10f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 6f)
                verticalLineToRelative(11f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 3f)
                verticalLineToRelative(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 8f)
                verticalLineToRelative(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 5f)
                verticalLineToRelative(13f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 10f)
                verticalLineToRelative(3f)
            }
}

public val LucideIcons.All.AudioLinesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AudioLines: ImageVector
    @Composable get() = AudioLinesDefinition.asImageVector()
