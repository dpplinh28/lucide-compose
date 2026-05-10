package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EyeOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.733f, 5.076f)
                arcToRelative(10.744f, 10.744f, 0f, false, true, 11.205f, 6.575f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, .696f)
                arcToRelative(10.747f, 10.747f, 0f, false, true, -1.444f, 2.49f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.084f, 14.158f)
                arcToRelative(3f, 3f, 0f, false, true, -4.242f, -4.242f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.479f, 17.499f)
                arcToRelative(10.75f, 10.75f, 0f, false, true, -15.417f, -5.151f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -.696f)
                arcToRelative(10.75f, 10.75f, 0f, false, true, 4.446f, -5.143f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
}

public val LucideIcons.All.EyeOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EyeOff: ImageVector
    @Composable get() = EyeOffDefinition.asImageVector()
