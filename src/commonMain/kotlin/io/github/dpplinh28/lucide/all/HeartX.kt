package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HeartX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(15.5f, 12.5f)
                lineToRelative(5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20.5f, 12.5f)
                lineToRelative(-5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.955f, 8.774f)
                arcToRelative(5.5f, 5.5f, 0f, false, false, -9.546f, -2.95f)
                arcToRelative(.6f, .6f, 0f, false, true, -.818f, 0f)
                arcTo(5.5f, 5.5f, 0f, false, false, 2f, 9.5f)
                curveToRelative(0f, 2.3f, 1.5f, 4f, 3f, 5.5f)
                lineToRelative(5.508f, 5.332f)
                arcToRelative(2f, 2f, 0f, false, false, 2.57f, .352f)
            }
}

public val LucideIcons.All.HeartXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HeartX: ImageVector
    @Composable get() = HeartXDefinition.asImageVector()
