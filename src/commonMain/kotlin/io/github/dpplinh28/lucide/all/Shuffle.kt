package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Shuffle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(18f, 14f)
                lineToRelative(4f, 4f)
                lineToRelative(-4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(18f, 2f)
                lineToRelative(4f, 4f)
                lineToRelative(-4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 18f)
                horizontalLineToRelative(1.973f)
                arcToRelative(4f, 4f, 0f, false, false, 3.3f, -1.7f)
                lineToRelative(5.454f, -8.6f)
                arcToRelative(4f, 4f, 0f, false, true, 3.3f, -1.7f)
                horizontalLineTo(22f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 6f)
                horizontalLineToRelative(1.972f)
                arcToRelative(4f, 4f, 0f, false, true, 3.6f, 2.2f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 18f)
                horizontalLineToRelative(-6.041f)
                arcToRelative(4f, 4f, 0f, false, true, -3.3f, -1.8f)
                lineToRelative(-.359f, -.45f)
            }
}

public val LucideIcons.All.ShuffleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Shuffle: ImageVector
    @Composable get() = ShuffleDefinition.asImageVector()
