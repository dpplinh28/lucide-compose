package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BellCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.268f, 21f)
                arcToRelative(2f, 2f, 0f, false, false, 3.464f, 0f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15f, 8f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.8607f, 4.4824f)
                arcTo(6f, 6f, 0f, false, false, 6f, 8f)
                curveTo(6f, 12.499f, 4.589f, 13.956f, 3.262f, 15.326f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.262f, 15.326f)
                arcTo(1f, 1f, 0f, false, false, 4f, 17f)
                horizontalLineTo(20f)
                arcTo(1f, 1f, 0f, false, false, 20.74f, 15.327f)
                curveTo(20.209f, 14.779f, 19.665f, 14.218f, 19.203f, 13.454f)
            }
}

public val LucideIcons.All.BellCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BellCheck: ImageVector
    @Composable get() = BellCheckDefinition.asImageVector()
